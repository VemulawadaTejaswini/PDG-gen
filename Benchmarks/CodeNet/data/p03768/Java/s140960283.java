import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] color = new int[n];
		int[][] dist = new int[n][n];
		for(int i=0;i<n;i++){
			color[i] = 0;
			for(int j=0;j<n;j++){
				dist[i][j] = Integer.MAX_VALUE;
			}
			dist[i][i] = 0;
		}
		
		int x;
		int y;
		
		for(int i=0;i<m;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		boolean changed = true;
		while(changed){
			changed = false;
			for(int i=0; i<m; i++){
				x = a[i]-1;
				y = b[i]-1;
				for(int j=0; j<n; j++){
					if( dist[x][j] == Integer.MAX_VALUE && dist[y][j] != Integer.MAX_VALUE ){
						dist[x][j] = dist[y][j] + 1;
						dist[j][x] = dist[x][j];
						changed = true;
					}else if( dist[y][j] == Integer.MAX_VALUE && dist[x][j] != Integer.MAX_VALUE ){
						dist[y][j] = dist[y][j] + 1;
						dist[j][y] = dist[y][j];
						changed = true;
					}
				}
			}
		}
		
		int q = sc.nextInt();
		int v;
		int d;
		int c;
		for(int i=0; i<q; i++){
			v = sc.nextInt()-1;
			d = sc.nextInt();
			c = sc.nextInt();
			for(int j=0; j<n; j++){
				if(dist[v][j]<=d){
					color[j] = c;
				}
			}
			/*for(int j=0; j<n; j++){
				System.out.println(color[j]);
			}*/
		}
		
		/*for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				System.out.println("dist["+i+"]["+j+"] = "+dist[i][j]);
			}
		}*/
		
		
		for(int i=0; i<n; i++){
			System.out.println(color[i]);
		}
		return;
	}
}