import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int p = sc.nextInt();
			int e = 0;
			int o = 0;
			long ret = 0;
			
			for(int i=0;i<n;i++) {
				int j = sc.nextInt();
				if(j%2==0) {
					e++;
				}else {
					o++;
				}
			}
			
			int c[][] = new int [2005][2005];

	       
	        
	        c[0][0]=1;
	        for(int i=0;i<2003;i++) {
	            for(int j=0;j<2003;j++) {
	                long tmp = c[i][j];
	                c[i+1][j]+=tmp;
	                c[i+1][j+1]+=tmp;
	            }
	        }
			
			
			
			long odd = 0;
			if(o==0||o==1) {
				odd=1;
			}else {
				for(int i=0;i<=o;i+=2) {
					odd += c[o][i];
				}
			}

			
			
			if(p==0) {
				ret = (long)pow(2, e)*odd;
			}else {
				ret = (long)pow(2, e+o)-(long)pow(2, e)*odd;
			}

			System.out.println(ret);
			
		}
		
		
		static long pow(int x,int y) {
			int count = 1;
			long ret = x;
			for(;count<y;) {
				ret *= x;
				count++;
			}
			if(y==0) {
				ret = 1;
				return ret;
			}
			return ret;
		}
	}
