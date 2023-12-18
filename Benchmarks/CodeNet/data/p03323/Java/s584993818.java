import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();

		boolean ans = false;

		if((n - m) == 1) ans = true;
		if((m - n) == 1) ans = true;
		if((n - m) == 0) ans = true;
		if(ans) System.out.println("Yay!");
		else
			System.out.println(":(");
	}

}
