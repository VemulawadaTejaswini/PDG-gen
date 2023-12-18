import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char b = 'a';
		for (int i = 0; i < 4; i++) {
			if(a[i] == b) continue;
			if(i > 1) {
				System.out.println("No");
				return;
			}else {
				b = a[i];
			}
		}
		System.out.println("Yes");
	}
}
