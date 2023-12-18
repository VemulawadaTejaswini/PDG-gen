import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		P[0] = sc.nextInt();
		int min = P[0];
		int R = 1;
		for(int i = 1; i < N; i++) {
			P[i] = sc.nextInt();
			if(P[i] <= min) {
				min = P[i];
				R++;
			}
		}
		System.out.println(R);
	}
}