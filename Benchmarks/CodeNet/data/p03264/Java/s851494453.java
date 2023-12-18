
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		System.out.print(kaesu(t));

	}

	static int kaesu(int a) {
		return((a+1)/2)*(a/2);
	}

}
