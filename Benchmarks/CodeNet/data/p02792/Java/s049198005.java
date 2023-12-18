import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt[][] = new int[10][10];
		for(int n = 1 ; n <= N ; ++n){
			int last = n % 10;
			int first = String.valueOf(n).charAt(0) - '0';
			if(first != 0){
				cnt[first][last]++;
			}
		}
		long S = 0;
		for(int A = 1 ; A <= N ; ++A){
			int alast = A % 10;
			int afirst = String.valueOf(A).charAt(0) - '0';
			S += cnt[alast][afirst];
		}
		System.out.println(S);
	}
}
