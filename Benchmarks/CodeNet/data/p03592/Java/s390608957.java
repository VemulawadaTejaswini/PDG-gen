import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		if((K % N == 0) ||(K%M==0)) {
			System.out.println("Yes");
		} else {
			for(int n=0; n<=N; n++) {
				for(int m=0; m<=M; m++) {
					if(n*M+m*N-2*(Math.min(m, n)*Math.max(m, n)) == K) {
						System.out.println("Yes");
						return;
					}
				}
			}
			System.out.println("No");
		}
	}

}