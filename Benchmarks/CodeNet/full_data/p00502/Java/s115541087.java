import java.util.*;
public class Main {
	static int mai,n;
	static int ue[]=new int[201];
	static int sita[]=new int[201];
	static int hade[]=new int[201];
	static int kion[]=new int[201];
	static int m[][]=new int[201][201];
	static int bfs(int day,int kei,int a){//aは前の派手さ
		if(n+1==day)return kei;
		if(m[day][a]>=0)return kei+m[day][a];
		int max=-1;
		boolean sw=false;
		for(int i=0;i<mai;i++){
			if(kion[day]<sita[i]||kion[day]>ue[i])continue;
			if(sw=false){
				sw=true;
				max=bfs(day+1,kei+Math.abs(a-hade[i]),hade[i]);
			}
			max=Math.max(bfs(day+1,kei+Math.abs(a-hade[i]),hade[i]),max);
		}
		m[day][a]=max-kei;
		return max;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		mai = in.nextInt();
		for(int i=1;i<=n;i++)kion[i]=in.nextInt();
		for(int i=0;i<mai;i++){
			sita[i]=in.nextInt();
			ue[i]=in.nextInt();
			hade[i]=in.nextInt();
		}
		for(int i=0;i<201;i++){
			for(int k=0;k<201;k++)m[i][k]=-1;
		}
		int max=0;
		for(int i=0;i<mai;i++){
			if(kion[1]<sita[i]||kion[1]>ue[i])continue;
			max=Math.max(bfs(2,0,hade[i]),max);
		}
		System.out.println(max);
	}
}