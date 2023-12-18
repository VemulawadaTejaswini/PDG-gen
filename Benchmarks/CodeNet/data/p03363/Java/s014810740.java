import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int temp = 0;
		int count = 0;
		int memo[] = new int[N+1];
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				temp += A[j];
				if(memo[j+1] !=0) {
					count +=memo[j];
					break;
				}
				if (temp == 0) {
					count++;
				}
			}
			memo[i] = count;
			temp = 0;
		}
		System.out.println(count);
	}
}
