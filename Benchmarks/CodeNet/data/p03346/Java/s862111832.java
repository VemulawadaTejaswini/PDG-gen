import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int c[] = new int[N];
		for(int i = 0; i < N; i++) {
			P[i] = sc.nextInt() - 1;
			c[P[i]] = i;
		}
		
		int ans_temp = 0;
		int pre = -1;
		int temp = 0;
		for(int i = 0; i < N; i++) {
			if(c[i] < pre) {
				ans_temp = Math.max(ans_temp, temp);
				temp = 1;
				pre = c[i];
			} else {
				temp++;
				pre = c[i];
			}
		}
		System.out.println(N - ans_temp);
	}
}
