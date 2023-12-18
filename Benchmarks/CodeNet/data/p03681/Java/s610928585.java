import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			
			long n = sc.nextLong();
			long m = sc.nextLong();
			long x = 1000000007L;
			long retn = 1L;
			long retm = 1L;
			long ret = 1L;
			
			if(Math.abs((n-m))!=0&&Math.abs((n-m))!=1) {
				System.out.println(0);
				return;
			}
			
			for(long i=1;i<=n;i++) {
				retn *= i;
				retn %= x;
				
			}
			
			for(long i=1;i<=m;i++) {
				retm *= i;
				retm %= x;
			}
			
			
			if(Math.abs(n-m)==0) {
				ret = (retn*retm*2)%x;
			}else {
				ret = (retn*retm)%x;
			}
			
			System.out.println(ret);
			
	    }
		
	}
	
