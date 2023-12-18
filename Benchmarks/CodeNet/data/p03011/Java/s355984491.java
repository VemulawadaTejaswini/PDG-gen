import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int min = 1000;

		if(p+q < min) {
			min = p+q;
		}
		if(p+r < min) {
			min = p+r;
		}
		if(r+q < min) {
			min = r+q;
		}
		System.out.println(min);
	}
}