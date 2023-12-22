import java.util.*;
import java.math.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger v = new BigInteger("1");
		BigInteger w = new BigInteger("1");
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a == 1) v += b * w;
			if(a == 2) v -= b * w;
			if(a == 3) v *= b;
			if(a == 4) w *= b;
		}
		System.out.println(v / w);
	}
}