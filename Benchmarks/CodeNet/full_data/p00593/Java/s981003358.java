import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[][] map = new int[n][n];
			
			boolean up = true;
			int y = 0;
			int x = 0;
			for(int i=1;i<=n*n;i++){
				
				map[y][x] = i;
				if(up==true){
					if(x==n-1){
						y++;
						up = false;
					}else if(y==0){
						x++;
						up = false;
					}else{
						x++;
						y--;
					}
				}else{
					if(y==n-1){
						x++;
						up = true;
					}else if(x==0){
						y++;
						up = true;
					}else{
						x--;
						y++;
					}
				}
				
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.printf("%3d", map[i][j]);
				}
				System.out.println();
			}
			
			
		}
	}	
}