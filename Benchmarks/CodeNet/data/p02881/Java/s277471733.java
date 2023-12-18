import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();

			long x = 1;
			long y = 1;
			
			boolean minNum = false;
			if (a % 2 == 0) {
				if (x > y) {
					y *= 2;
				} else {
					x *= 2;
				}
				a /= 2;
				minNum=true;
			}
			
			for (long i = 3; i <= a;) {
				if (a % i == 0) {
					if (x > y) {
						y *= i;
					} else {
						x *= i;
					}
					minNum=true;
					a /= i;
				} else {
					i+=2;
				}
				if(a < i*i && !minNum) {
					break;
				}
			}
			
			if(!minNum) {
				x = a;
			}
			System.out.println(x + y - 2);

		}
	}

}