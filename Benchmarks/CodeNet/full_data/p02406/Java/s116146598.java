import java.util.Scanner;

public class Main {

	private static int count = 1;
	private static int n;
	private static int x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check_Num();
		System.out.println();
		sc.close();
	}

	private static void check_Num() {
		x = count;
		if (x % 3 == 0) {
			System.out.print(" " + x);
			end_Check_Num();
		} else {
			include3();
		}
	}

	private static void include3() {
		String value = String.valueOf(x);
		for (int index = value.length(); index > 0; index--) {
			if (x / (int) Math.pow(10, index - 1) % 10 == 3) {
				System.out.print(" " + x);
				end_Check_Num();
			}
		}
		end_Check_Num();
	}

	private static void end_Check_Num() {
		count++;
		if (count <= n) {
			check_Num();
		}
	}
}
