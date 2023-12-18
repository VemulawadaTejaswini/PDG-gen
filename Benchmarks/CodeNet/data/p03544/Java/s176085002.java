import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		System.out.println(func(n));
	}

	static long func(int n) {
		if(n==0)return 2;
		if(n==1)return 1;
		return func(n-1)+func(n-2);
	}
}