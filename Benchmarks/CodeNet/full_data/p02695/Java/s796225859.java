import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		public static int n;
		public static int m;
		public static int q;
		public static int max;
		
		public static int[] a ;
		public static int[] b ;
		public static int[] c ; 
		public static int[] d ;
		public static int[] f ;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			 n = sc.nextInt();
			 m = sc.nextInt();
			 q = sc.nextInt();
			 
			 a = new int[q];
			 b = new int[q];
			 c = new int[q];
			 d = new int[q];
			 f = new int[n];
			

			
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			for(int i=0;i<q;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			
			dfs(0,1);
			
			System.out.println(max);
			
		}
		
		private static void dfs(int inde, int num) {
			
			if(inde==n) {
				int count =0;
				
				for(int i=0;i<q;i++) {
					if(f[b[i]-1]-f[a[i]-1]==c[i]) {
						count+=d[i];
					}
				}
				
				max=Math.max(max, count);
				return;
			}
			
			
			for(int i=num;i<=m;i++) {
				f[inde] = i;
				dfs(inde+1,i);
				
			}
			
		}
		
	}
