import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int now =1;
		int count =0;
		while (now!=2) {
			if (count>N) {
				break;
			}
			now = a[now-1];
			count++;
		}
		if (count>N) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}
}