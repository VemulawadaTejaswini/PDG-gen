import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num[];
		int answer[];
		int N = sc.nextInt();
		num = new int[N];
		answer = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int lastsum = num[N - 1];
		for(int i = 0; i < N - 1; i += 2) {
			lastsum -= num[i];
		}
		for(int i = 1; i < N ; i += 2) {
			lastsum += num[i];
		}
		answer[N - 1] = lastsum;
		for(int i = N - 2 ; i >= 0 ; i--) {
			answer[i] = 2 * num[i] - answer[i + 1];
		}
		for(int i = 0; i < N; i++) {
			if(i == N - 1) System.out.print(answer[i]);
			else System.out.print(answer[i] + " ");
		}
		sc.close();
	}
}