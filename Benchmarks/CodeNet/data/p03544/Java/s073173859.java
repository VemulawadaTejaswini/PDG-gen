import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N+1];
		L[0]=2;
		L[1]=1;
		if(N == 1) {
			System.out.println(1);
		} else {
		for(int i=2; i<=N; i++) {
			L[i]=L[i-1]+L[i-2];
			if(i == N) {
				System.out.println(L[i]);
			}
		}
	}

	}

}
