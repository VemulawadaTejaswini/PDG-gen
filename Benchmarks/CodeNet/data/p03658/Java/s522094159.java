import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		int[] l = new int[N];
		for(int i = 0;i < N;i ++) {
			l[i] = sc.nextInt();
		}
		int x;
		for(int i = 0;i < N;i ++) {
			for(int k = i + 1;k < N;k ++) {
				if(l[i] < l[k]) {
					x = l[i];
					l[i] = l[k];
					l[k] = x;
				}
			}
		}
		for(int i = 0;i < K;i ++) {
			sum = sum + l[i];
		}
		System.out.println(sum);
	}
}