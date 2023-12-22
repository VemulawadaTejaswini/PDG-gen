import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		int a = N/X;
		
		System.out.print((a+1) * T);
	}

}