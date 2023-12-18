import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] AR = new int[3];
		AR[0] = sc.nextInt();
		AR[1] = sc.nextInt();
		AR[2] = sc.nextInt();
		int max = 0;
		Arrays.sort(AR);
		int combined = AR[2]*10 + AR[1];
		System.out.println(combined + AR[0]);
	}

}
