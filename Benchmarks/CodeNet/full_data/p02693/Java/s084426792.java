
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = "NG";
		for(int i=a; i<=b;i++) {
			if(i % k == 0) {
				result = "OK";
				break;
			}
		}
		System.out.println(result);

	}

}
