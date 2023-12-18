import java.util.*;

class Main{
	public static long gcd(long a, long b) {
		return a%b==0 ? b : gcd(b, a % b);
	}

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		long r=0;
		for(String t:s.next().replaceAll("BC","#").split("A*[BC]+")) {
			long c=0;
			for(int i=t.length()-1;i>=0;--i) {
				if(t.charAt(i)=='#')
					++c;
				else
					r+=c;
			}
		}
		System.out.println(r);
	}
}
