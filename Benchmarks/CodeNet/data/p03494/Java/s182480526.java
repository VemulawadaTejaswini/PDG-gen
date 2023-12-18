import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String s = sc.next();
		String strs[] = s.split(" ", 0);

		int num = 0;
		int count = 0;

		for (String str : strs) {
			num = Integer.parseInt(str);
			if (num%2 == 0) {
				count++;
			} else {
				break;
			}
		}

		System.out.println(count);
	}

}
