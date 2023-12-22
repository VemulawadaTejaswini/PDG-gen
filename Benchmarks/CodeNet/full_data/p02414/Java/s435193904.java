import java.util.Scanner;
class Main {
	    int n,m,l;
	    public void solve(){
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        m = sc.nextInt();
	        l = sc.nextInt();
	        int [][] a = new int [n+1][m+1];
	        int [][] b = new int [m+1][l+1];
	        int [][] c = new int [n+1][l+1];
	        for(int x = 0; x < n; x++){
	            for(int y = 0; y < m; y++){
	                a[x][y] = sc.nextInt();
	            }
	        }
	        for(int x = 0; x < m; x++){
	            for(int y = 0; y < l; y++){
	                b[x][y] = sc.nextInt();
	            }
	        }
	        for(int x = 0; x < n; x++){
	            for(int y = 0; y < l; y++){
	            	c[x][y] = 0;
	            }
	        }
	        for(int x = 0; x < n; x++){
	            for(int y = 0; y < l; y++){
	            	for(int r = 0; r < m; r++){
            			c[x][y] = c[x][y] + a[x][r] * b[r][y];
	            	}
	                System.out.printf("%d ",c[x][y]);
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args){
	        new Main().solve();
	    }
}