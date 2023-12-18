import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int sum = A + B;
		int diff = A - B;
		int prod = A * B;
		int max = sum;

		//和と差の比較
		if(max < diff) {
			max = diff;
		}

		//和と差のうち大きい数と積の比較
		if(max < prod) {
			max = prod;
		}

		System.out.println(max);
	}
}