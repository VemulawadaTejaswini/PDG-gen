import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
        System.out.println(calc(A, B, C, K));
    }

    public static int calc(int A, int B, int C, int K) {
		int total = 0;
		int mid = Integer.max(A, B);
		int low = Integer.min(A, B);
		int max = Integer.max(mid, C);
		for (int i = 1; i <= K; i++) {
			total = total + max * 2;
		}
		total = total + mid + low;
		return total;
	}
}