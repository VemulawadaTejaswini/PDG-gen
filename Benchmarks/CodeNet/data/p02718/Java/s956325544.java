import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] shohinArray = new int[n];
		for(int i = 0;i < n;i++) {
			shohinArray[i] = sc.nextInt();
		}
		int totalVote = 0;
		for(int i = 0;i < n;i++) {
			totalVote += shohinArray[i];
		}
		Arrays.sort(shohinArray);
		double rate = (shohinArray[n  -m] * 100000)/totalVote;
		double base = 100000 / (4 * m);
		if(rate >= base ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}