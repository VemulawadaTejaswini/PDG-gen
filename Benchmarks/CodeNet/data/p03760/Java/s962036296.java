import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();

		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i]);
			if(b.length > i) System.out.print(b[i]);
		}
		System.out.println();
	}
}