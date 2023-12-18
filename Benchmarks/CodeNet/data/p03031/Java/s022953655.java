import java.util.Scanner;


	public class Main {
		
		
		public static int n;
		public static int m;
		public static int[] k;
		public static int[][] s;
		public static int[] p;
		public static int ret;
		public static int ret2;
		public static int[] sw;
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			n = sc.nextInt();
			m = sc.nextInt();
			k = new int[m];
			s = new int[m][n];
			p = new int[m];
			sw = new int[n];
			ret = 0;
			
			
			
			
			for(int i=0;i<m;i++) {
				k[i] = sc.nextInt();
				
				for(int j=0;j<k[i];j++) {
					s[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<m;i++) {
				p[i] = sc.nextInt();
			}
			
			dfs(0);
			
			System.out.println(ret);
			
	    }
		
		public static void dfs(int index) {
			
			if(index==n) {
				
				ret2 =0;
				for(int i=0;i<m;i++) {
					int sum = 0;
					for(int j=0;j<k[i];j++) {
						sum+=sw[(s[i][j]-1)];
					}
					
					if(sum%2!=p[i]) {
						return;
					}
					
				}
				ret++;
				
				
				return;
			}
			
			sw[index] = 0;
			dfs(index+1);
			
			sw[index] = 1;
			dfs(index+1);
			
		}
		
	}
	
