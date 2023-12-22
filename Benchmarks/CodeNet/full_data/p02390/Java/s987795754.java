import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int S = cin.nextInt();
		int s = S%60;
		int m = (S/60)%60;
		int h = (S/60)/60;
		System.out.println(h + ":" + m + ":" + s);
	}
}
