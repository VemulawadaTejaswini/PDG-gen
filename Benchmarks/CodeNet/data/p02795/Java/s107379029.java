import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H  =scn.nextInt(), W = scn.nextInt();
		int N = scn.nextInt();
		
		int D = Math.max(H, W);
		System.out.println((N-1)/D + 1);
	}

}
