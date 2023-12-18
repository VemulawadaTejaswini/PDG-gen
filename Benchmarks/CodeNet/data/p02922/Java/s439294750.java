import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt();
		int ans = (B%(A-1)==0)?B/(A-1):B/(A-1)+1;

		System.out.println(ans);
	}

}
