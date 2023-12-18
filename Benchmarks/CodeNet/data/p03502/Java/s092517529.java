import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int i = 0;
		double sum = 0;
		while(true) {
			sum += t % 10;
			t = t / 10;
			i++;
			if(t < 1) break;
		}
		if(n % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}