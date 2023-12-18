import java.util.Scanner;

public class Main {

	private static final int k = 2019;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
      	int j = sc.nextInt();
      	
      	int res = (i % k) * (j * k);
      	System.out.println(res%k);
		sc.close();
	}
}