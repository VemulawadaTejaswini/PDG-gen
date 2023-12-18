import java.util.Scanner;
import java.awt.Point;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k=sc.nextInt();
		int[][] map=new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(i!=j){
					map[i][j]=Integer.MAX_VALUE/10;
				}
			}
		}
		for(int i=0; i<n-1; i++){
			map[i][i+1]=1;
			map[i+1][i]=1;
		}
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				for(int t = 0; t<n; t++){
						map[j][t]=Math.min(map[j][t],map[j][i]+map[i][t]);
				}
			}
		}
		int count=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(map[i][j]==2){
					count++;
				}
			}
		}
		count/=2;
		if(count<k){
			System.out.println(-1);
			return;
		}else if(count==k){
			System.out.println(n-1);
			for(int i=0; i<n-1; i++){
				System.out.println((i+1)+" "+(i+2));
			}
			return;
		}
		int cc=count-k;
		int m=cc+n-1;
		Point[] qq=new Point[cc];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(map[i][j]==2){
					qq[cc--]=new Point(i,j);
					if(cc==0){
						break;
					}
				}
			}
		}
		System.out.println(m);
		for(int i=0; i<n-1; i++){
			System.out.println((i+1)+" "+(i+2));
		}
		for(int i=0; i<qq.length; i++){
			System.out.println(qq[i].x+" "+qq[i].y);
		}
	}
}

