import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		StringBuilder ans = new StringBuilder();
//		while (--t >= 0) {
		int n = sc.nextInt();
		int numOfNotes = n / 1000;
		if (n % 1000 != 0)
			numOfNotes++;
		System.out.println(1000 * numOfNotes - n);
	}
}
//}
