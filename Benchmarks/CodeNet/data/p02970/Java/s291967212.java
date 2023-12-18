import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		int a = 0;
		if(n % (2*d + 1)==0) {
			a = n / (2*d + 1);
		}else {
			a = n / (2*d + 1) +1;
		}

		System.out.println(a);
	}

}