import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			char first = s.charAt(i);
			char second = s.charAt(i + 1);
			char third = s.charAt(i + 2);
			if (first == 'A' && second == 'B' && third == 'C') {
				count++;
			}
		}
		print(count);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
