import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		String s=scanner.next();
		String t=scanner.next();
		long l=lcm(n,m);
		String x[]=new String[(int)l+1];
		for(int i=0;i<l+1;i++) {
			x[i]="NO";
		}
		for(int i=0;i<n;i++) {
			x[(int) (i*l/n+1)]=String.valueOf(s.charAt(i));
		}
		for(int i=0;i<m;i++) {
			int ind=(int) (i*l/m+1);
			String tmp=String.valueOf(t.charAt(i));
			if(tmp.equals(x[ind])) {
				continue;
			}else if(x[ind].equals("NO")) {
				x[ind]=tmp;
			}
			else {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(l);
	}
	
	/*******************************************************************
	最大公約数
	*******************************************************************/

	static long gcd(long a, long b) {
			long temp;
			while ((temp = a % b) != 0) {
				a = b;
				b = temp;
			}
			return b;
		}


	/*******************************************************************
	最小公倍数
	*******************************************************************/

		 static long lcm(long m, long n) {
			return m / gcd(m, n) * n;
		}

}