import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int t = 0;
		int s = 0;
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			t+=a[i];
		}
		sc.close();
		for(int i=0; i<N; i++) {
			if(a[i]>=(t/(4*M))) s++;
		}
		if(s>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}