
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int keta = 1;
		while(b / (int) Math.pow(10, keta) != 0)
			keta++;
		int wa = (int) (a * Math.pow(10, keta) + b);
		double ans = (int) Math.sqrt(wa);
		if(ans == Math.sqrt(wa)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
