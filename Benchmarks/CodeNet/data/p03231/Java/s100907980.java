import java.util.HashMap;
import java.util.Map;
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
		Map<Long,String>map=new HashMap<>();
		for(int i=0;i<n;i++) {
			Long indn=(Long) (i*l/n+1);
			String tmps=String.valueOf(s.charAt(i));
			map.put(indn, tmps);
		}
		for(int i=0;i<m;i++) {
			Long indm=(Long) (i*l/m+1);
			String tmpt=String.valueOf(t.charAt(i));
			if (map.containsKey(indm)) {
				if(map.get(indm).equals(tmpt)) {
					
				}
				else {
					System.out.println(-1);
					return;
				}
			} 
			map.put(indm, tmpt);
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