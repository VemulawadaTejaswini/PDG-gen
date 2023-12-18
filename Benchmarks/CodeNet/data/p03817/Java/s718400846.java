import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC053B b = new ABC053B();
	}
}

class ABC053B {
	
	ABC053B() {
		Scanner cin = new Scanner(System.in);
		long x = cin.nextLong();
		if (x <= 6) {
			System.out.println(1);
			return;
		}
		
		if (x <= 11) {
			System.out.println(2);
			return;
		}
		
		long count = (x / 11) * 2;
		if (x % 11 <= 6) {
			count++;
		} else {
			count += 2;
		}
		System.out.println(count);
		
	}
}