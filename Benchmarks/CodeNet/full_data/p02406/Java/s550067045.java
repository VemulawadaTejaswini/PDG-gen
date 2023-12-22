import java.util.*;

public class Main {
	static Boolean three(int n) {
		if(n%3 == 0)
			return true;

		do {
			if(n%10 == 3)
				return true;
		}while((n /= 10) > 0);

		return false;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for(int i = 3; i <= n; i++)
			if(three(i))
				System.out.print(String.format(" %d", i));
		System.out.println();
	}
}

