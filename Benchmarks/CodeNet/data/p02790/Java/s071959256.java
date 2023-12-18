import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int bi = Math.max(a, b);
		int sm = Math.min(a, b);
		for(int i = 0; i < bi; i++) {
			System.out.print(sm);
		}
	}
}