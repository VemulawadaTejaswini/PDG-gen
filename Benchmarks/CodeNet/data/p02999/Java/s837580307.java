package Test;

public class Main {
	public static void main(String[] args) {
		int integ[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int A = integ[(int) (Math.random() * 10)];
		int X = integ[(int) (Math.random() * 10)];
		if (X < A) {
			System.out.print(0);
		} else {
			System.out.print(10);
		}
	}
}
