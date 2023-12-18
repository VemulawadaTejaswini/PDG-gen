import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		
		int[] h = new int[N];
		
		for(int i = 0; i < N; i++) {
			h[i] =sc.nextInt();
		}
		
		int[] hn = new int[N];
		int sum = 0;
		boolean check = false;
		int count = 0;
		
		while(count < N) {
			count = 0;
			for(int i = 0; i < N; i++) {
				if(h[i] > hn[i]) {
					hn[i]++;
					check = true;
					if(i == N - 1) {
						sum++;
						check = false;
					}
				} else {
					if(check) {
						sum++;
						check = false;
					}
				}
			}
			
			for(int i = 0; i < N; i++) {
				if(h[i] == hn[i]) {
					count++;
				}
			}
		}
		System.out.println(sum);
	}
}
