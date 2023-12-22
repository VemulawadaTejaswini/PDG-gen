import java.util.Scanner;
public class Main{
	static int[][] map=new int[14][14];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			int x=Integer.parseInt(str[0])+2;
			int y=Integer.parseInt(str[1])+2;
			int s=Integer.parseInt(str[2]);
			if(s==1){
				map[y-1][x]++;
				map[y][x-1]++;
				map[y][x]++;
				map[y][x+1]++;
				map[y+1][x]++;
			}
			if(s==2){
				for(int i=y-1;i<=y+1;i++){
					for(int j=x-1;j<=x+1;j++){
						map[i][j]++;
					}
				}
			}
			if(s==3){
				for(int i=y-1;i<=y+1;i++){
					for(int j=x-1;j<=x+1;j++){
						map[i][j]++;
					}
				}
				map[y-2][x]++;
				map[y][x-2]++;
				map[y][x+2]++;
				map[y+2][x]++;
			}
		}
		int count=0;
		int max=0;
		for(int i=2;i<12;i++){
			for(int j=2;j<12;j++){
				if(map[j][i]==0){
					count++;
				}
				if(map[j][i]>max){
					max=map[j][i];
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}