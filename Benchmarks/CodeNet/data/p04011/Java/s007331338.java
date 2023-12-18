import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int fee = x * Math.min(n, k);
		if (n > k) fee += y * (n - k);
		
		System.out.println(fee);
		
		sc.close();
	}
}

