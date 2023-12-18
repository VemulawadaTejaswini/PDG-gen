import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		int count = 1;
		while (c < b) {
			c = c - 1 + a;
			count = count + 1;
		}
		System.out.println(count);
	}
}