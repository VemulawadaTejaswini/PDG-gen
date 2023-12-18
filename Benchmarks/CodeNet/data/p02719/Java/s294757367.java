import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, k;
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		int t = n % k;
		if(t < (k - n))
			System.out.println(t);
		else
			System.out.println(k - t);
		

		scanner.close();
	}

}
