
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		
		long k = xor(a-1)^xor(b);
		
		System.out.println(k);
		
	}
	static long xor(long x) {
		if(x % 2 == 0) {
			if(x % 4 == 2) {
				return x^1;
			}
			else {
				return x^0;
			}
		}
		else {
			if((x+1)%4 == 2) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}

}
