import java.util.Scanner;


	public class Main {
		
		public static int n;
		public static int m;
		public static int q;
		public static int[] a ;
		public static int[] b ;
		public static int[] c ;
		public static int[] d ;
		public static int[] f ; 
		public static int ret;

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
			
			for(int i=0;i<q;i++) {
				a[i] = sc.nextInt()-1;
				b[i] = sc.nextInt()-1;
				c[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			
			dfs(0,1);
			System.out.println(ret);
	    }
		
		
		public static void dfs(int index,int num) {
			
			if(index==n) {
				int sum = 0;
				for(int i=0;i<q;i++) {
					if(f[b[i]]-f[a[i]]==c[i]) {
						sum += d[i];
					}
				}
				ret = Math.max(ret, sum);
				return;
			}
			
			
			for(int i=num;i<=m;i++) {
				f[index] = i;
				dfs(index+1,i);
			}
		}
		
	}
	
