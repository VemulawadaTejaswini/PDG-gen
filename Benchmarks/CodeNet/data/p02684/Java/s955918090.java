import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = Long.parseLong((sc.next()));
		int[] a = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		int now = a[0];
		int tmp;
		for (long j = 0; j < k - 1; j++){
			tmp = a[now-1];
			now = tmp;
		}
		System.out.println(now);
	}
}