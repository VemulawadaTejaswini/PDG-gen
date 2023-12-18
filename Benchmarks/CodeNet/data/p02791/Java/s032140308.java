import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();
		int a = 0;
		for(int i=0; i<N; i++) {
			int p = P[i];
			boolean flag = true;
			for(int j=0; j<i; j++) {
				if(P[j]<p) flag = false;
			}
			if(flag)a++;
		}
		System.out.println(a);
	}

}