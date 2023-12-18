import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++)arr[i]=K;
		if (Q < K) {
			while (N-- > 0) {
				System.out.println("YES");
			}
		} else {
			for(int i = 0;i<Q;i++) {
				int temp = sc.nextInt();
				arr[temp-1]++;
			}
			for(int i = 0;i<N;i++) {
				//System.out.println(arr[i]);
				System.out.println(arr[i]>Q?"YES":"NO");
			}
			
		}
	}

}
