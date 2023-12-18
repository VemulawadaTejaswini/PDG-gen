import java.util.*;



public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int R = N;
		for(int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
			for(int j = i; j >= 0; j--) {
				if(P[i] > P[j]) {
					R--;
					break;
				}
			}
		}
		System.out.println(R);
	}
}