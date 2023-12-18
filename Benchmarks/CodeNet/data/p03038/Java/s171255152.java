import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();
		}


		for(int i=0; i<M; i++) {

			int b=sc.nextInt();
			int c=sc.nextInt();
			Arrays.sort(A);
			int j=0;
			while(b>0 && A[j]<c) {
				A[j]=c;
				b--;
				j++;
			}
		}

		long ans = 0;
		for(int i=0; i<N; i++) {
			ans += A[i];
		}
		System.out.println(ans);

		sc.close();
	}
}
