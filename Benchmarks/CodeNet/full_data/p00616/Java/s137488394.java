import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int h = sc.nextInt();
			
			if(n == 0 && h == 0){
				break;
			}
			
			boolean[][] xy = new boolean[n][n];
			boolean[][] yz = new boolean[n][n];
			boolean[][] xz = new boolean[n][n];
					
			int ans = n * n * n;
			
			for(int i = 0; i < h; i++){
				final String c = sc.next();
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				if("xy".equals(c) && !xy[a][b]){
					int hole = 0;
					for(int z = 0; z < n; z++){
						if(yz[b][z] || xz[a][z]){
							hole++;
						}
					}
					
					ans -= n - hole;
					
					xy[a][b] = true;
				}else if("yz".equals(c) && !yz[a][b]){
					int hole = 0;
					for(int x = 0; x < n; x++){
						if(xy[x][a] || xz[x][b]){
							hole++;
						}
					}
					
					ans -= n - hole;
					
					yz[a][b] = true;
				}else if("xz".equals(c) && !xz[a][b]){
					int hole = 0;
					for(int y = 0; y < n; y++){
						if(yz[y][b] || xy[a][y]){
							hole++;
						}
					}
					
					ans -= n - hole;
					
					xz[a][b] = true;
				}
			}
			
			System.out.println(ans);
		}
		
	}

}