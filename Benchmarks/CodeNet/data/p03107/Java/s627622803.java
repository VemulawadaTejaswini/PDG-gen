import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int result = 0;
		int first = 0;
		int second = 1;
		int pointer = 0;
		while (input.length()>second) {
			String s1 = input.substring(first, first + 1);
			String s2 = input.substring(second, second + 1);
			if (!s1.equals(s2)) {
				input = input.replaceFirst(s1+s2,"");
				result = result + 2;
				first=0;
				second=1;
			} else {
				first++;
				second++;
			}
			pointer = first;
		}
		System.out.println(result);
		sc.close();
	}
}