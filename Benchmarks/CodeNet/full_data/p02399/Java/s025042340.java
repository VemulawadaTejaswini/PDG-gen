import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[2];
		num[0] = scn.nextInt();
		num[1] = scn.nextInt();
		System.out.printf("%d %d %f", num[0]/num[1], num[0]%num[1], (float)num[0]/num[1]);
	}
}

