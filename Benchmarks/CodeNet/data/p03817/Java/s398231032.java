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
		
		if (x <= 15) {
			System.out.println(2);
			return;
		}
		System.out.println((x / 11) * 2 + 1);
	}
}