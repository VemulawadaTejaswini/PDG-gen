import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max ;
		if (A < B) {
			max = A;
		}else {
			max = B;
		}
		int min;
		if ((A + B) < N) {
			min = 0;
		}else {
			min = (A + B) - N;
		}
		System.out.println(max +" "+ min);
	}
}
