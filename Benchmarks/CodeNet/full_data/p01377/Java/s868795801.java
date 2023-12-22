import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] cs = new Scanner(System.in).next().toCharArray();
		int count = 0;
		int size = cs.length;
		for (int i = 0; i < size; i++) {
			char r = cs[size - 1 - i];
			char l = cs[i];
			if (!(r == '(' && l == ')' || r == ')' && l == '(' || r == 'i' && l == 'i' || r == 'w' && l == 'w')) {
				count++;
			}
		}
		System.out.println((int) (count / 2.0d + .5));
	}
}