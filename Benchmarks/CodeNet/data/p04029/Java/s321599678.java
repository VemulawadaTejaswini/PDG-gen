import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(recursive(N));
		scanner.close();
	}public static int recursive(int n) {
		if(n==1) return 1;
		else return recursive(n-1)+n;
	}

}
