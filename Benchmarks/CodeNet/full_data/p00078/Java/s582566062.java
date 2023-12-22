import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[n][n];
			
			map[n/2+1][n/2] = 1;
			int y = n/2+1;
			int x = n/2;
			for(int i=2;i<=n*n;i++){
				x++;
				y++;
				while(true){
					if(x==n)x=0;
					if(x==-1)x=n-1;
					if(y==n)y=0;
					if(map[y][x]!=0){
						x--;
						y++;
					}else{
						break;
					}
				}
				map[y][x] = i;
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.printf("%4d", map[i][j]);
				}
				System.out.println();
			}
				
		}
	}	
}