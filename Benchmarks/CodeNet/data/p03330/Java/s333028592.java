import java.util.*;

public class Main{
	static int[][] d,c;
	static int n,C;

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int min = 1000000;
		
		int tmp;
		
		n = sc.nextInt();
		C = sc.nextInt();
		
		d = new int[C][C];
		c = new int[n][n];

		
		for(i = 0;i < C;i++){
			for(j = 0;j < C;j++){
				d[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0;i < n;i++){
			for(j = 0;j < n;j++){
				c[i][j] = sc.nextInt();
			}
		}
		
		for(i = 0;i < C;i++){
			for(j = 0;j < C;j++){
				if(i == j)continue;
				for(k = 0;k < C;k++){
					if(k == i || k == j)continue;
					tmp = 0;
					tmp += mapChange(i,0);
					tmp += mapChange(j,1);
					tmp += mapChange(k,2);
					
					if(tmp < min){
						min = tmp;
					}
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static int mapChange(int color,int num){
		int sum = 0;
		int i,j;
		for(i = 0;i < n;i++){
			for(j = 0;j < n;j++){
				if((i + j) % 3 == num){
					sum += d[c[i][j] - 1][color];
				}
			}
		}
		return sum;
	}
}