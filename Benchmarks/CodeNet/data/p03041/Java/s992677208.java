import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String str = sc.next();
		int tmp = 'a' - 'A';
		char[] array = str.toCharArray();
		array[k - 1] += tmp;
		System.out.println(array);
	}
}
