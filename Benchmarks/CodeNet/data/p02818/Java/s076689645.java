import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		if(k>a) {
			if(k-a>b) {
				System.out.println("0 0");
			}else {
				System.out.println("0 " + (b-(k-a)));
			}
		}else {
			System.out.println(a-k + " " + b);
		}
	}
}