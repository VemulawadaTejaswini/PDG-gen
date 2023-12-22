import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[n][n];
			int k=0;
			
			for(int i=0;i<n/2;i++){
				k++;
				for(int j=i;j<n-i;j++){
					map[i][j] = k;
					map[n-i-1][j] = k;
					map[j][i] = k;
					map[j][n-i-1] = k;
				}
				if(k==3)k=0;
			}
			k++;
			if(n%2==1){
				map[n/2][n/2] = k;
			}
			
			int m = sc.nextInt();
			int x = 0;
			int y = 0;
			for(int i=0;i<m;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println(map[y-1][x-1]);
			}
			
		}
		
	}	
}