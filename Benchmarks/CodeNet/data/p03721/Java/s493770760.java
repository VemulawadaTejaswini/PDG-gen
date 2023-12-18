import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[100001];
		for(int i = 0; i < N; i++)
			a[sc.nextInt()] += sc.nextInt();
		int n = 0;
		for(int i = 0; i < 100001; i++) {
			n += a[i];
			if(n >= K) {
				System.out.println(i);
				break;
			}
		}

	}

}