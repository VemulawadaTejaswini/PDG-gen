import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), ind = -1;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(A == 1) ind = i + 1;
		}
		int left = ind, right = ind;
		int cnt = 0;
		while(right < N) {
			right = right + K - 1;
			cnt++;
		}
		while(left > 1) {
			left = left - K + 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}