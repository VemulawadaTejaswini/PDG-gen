import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int ans = (L*2+N-1)*N/2;
		int min = Integer.MAX_VALUE;
		int pick = 0;
		for(int i = 0; i < N; i++) {
			if(Math.abs(L+i) < min) {
				min = Math.abs(L+i);
				pick = L+i;
			}
		}
		System.out.println(ans-pick);
	}

}