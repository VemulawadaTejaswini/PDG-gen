import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long user = input.nextLong();
		
		if (user % 2 == 0) {
			if (user < 10) {
				System.out.println("0");
			} else {
				long fives = 0;
				for (long i = 2; i <= user; i += 2) {
					if (i % 5 == 0) {
						fives++;
						if (String.valueOf(i).charAt(0) == '5') {
							fives++;
						}
						i += 8;
					}
				}
				System.out.println(fives);
			}
		} else {
			System.out.println("0");
		}
	}
}
