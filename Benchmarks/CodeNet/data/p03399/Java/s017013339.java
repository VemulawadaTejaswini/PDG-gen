
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int busBudget = 0;
		int trainBudget = 0;

		if (a == b) {
			trainBudget = a;
			busBudget = c < d ? c : d;
		} else if (c == d) {
			trainBudget = a < b ? a : b;
			busBudget = c;
		} else {
			trainBudget = a < b ? a : b;
			busBudget = c < d ? c : d;
		}
		System.out.println(busBudget + trainBudget);
	}
}
