import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double min= 100000;
		int num = 0;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			double re = Math.abs(A-(T-temp *0.006));
			if (re<min) {
				min = re;
				num =i+1;
			}
		}
		System.out.println(num);
	}
}