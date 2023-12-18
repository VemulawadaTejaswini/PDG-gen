import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long t = System.currentTimeMillis();
		new Main().run();
		System.err.println(System.currentTimeMillis() - t);
	}
	
	boolean f(char[] cs,int l,int r) {
		boolean ret=true;
		while(l<r) {
			ret&=cs[l]==cs[r-1];
			++l;--r;
		}
		return ret;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		char[] cs=sc.next().toCharArray();
		int n=cs.length;
		System.out.println(n%2==1&&f(cs,0,n)&&f(cs,0,(n-1)/2)&&f(cs,(n+3)/2-1,n)?"Yes":"No");
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
