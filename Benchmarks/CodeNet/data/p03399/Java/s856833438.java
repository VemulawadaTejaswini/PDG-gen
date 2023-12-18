
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
			busBudget = d < c ? c : d;
			System.out.println(busBudget + trainBudget);
		} else if (c == d) {
			trainBudget = b < a ? a : b;
			busBudget = c;
			System.out.println(busBudget + trainBudget);
		} else {
			trainBudget = b < a ? a : b;
			busBudget = d < c ? c : d;
			System.out.println(busBudget + trainBudget);
		}
	}
}
