import java.util.*;
public class Main {
	static void print(int[][] a){
		for(int s=0;s<100;s++){
			for(int i=0;i<100;i++)if(a[s][i]!=-1)System.out.print(a[s][i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//右か下に行ける最大値
		int[][] input = new int[100][100];
		int[][] dp = new int[5][5];
		for(int s=0;s<100;s++)for(int i=0;i<100;i++)input[s][i]=-1;
		String[] data = new String[100];
		int cnt=0;
		while(in.hasNext()){
			data[cnt]=in.nextLine();
			cnt++;
		}
		for(int s=0;s<cnt;s++){
			String[] a= data[s].split(",");
			for(int i=0;i<a.length;i++)input[s][i]=Integer.parseInt(a[i]);
		}
		
		for(int s=1;s<(cnt+1)/2;s++){
			for(int i=0;i<100;i++){
				if(input[s][i]==-1)break;
				int x=i,y=s-1;
				int max=0;
				if(y>=0||x>=0)max = input[y][x];
				if((x-1)>=0)max=Math.max(max,input[y][x-1]);
				input[s][i]+=max;
			}
		}
		for(int s=(cnt+1)/2;s<cnt;s++){
			for(int i=0;i<10;i++){
				if(input[s][i]==-1)break;
				int x=i,y=s-1;
				int max=0;
				if(y>=0||x>=0)max = input[y][x];
				if((x+1)>=0)max=Math.max(max,input[y][x+1]);
				input[s][i]+=max;
			}
		}
		System.out.println(input[cnt-1][0]);
	}
}