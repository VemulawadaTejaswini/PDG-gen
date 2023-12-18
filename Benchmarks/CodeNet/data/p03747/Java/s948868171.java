import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int[] X = new int[N];
		int[] W = new int[N];
		for(int i = 0; i < N ; i++) {
			X[i] = Integer.parseInt(sc.next());
			W[i] = Integer.parseInt(sc.next());
		}

		for(int i = 1; i <= T; i++) {
			for(int j = 0; j < N; j++) {
				if(j == N-1) {
					if(collision(X[j], X[0], W[j], W[0])) {
						j++;
					}
					else {
						X[j] = moveAnt(X[j], W[j], L);
						X[0] = moveAnt(X[0], W[0], L);
					}
				}else {
					if(collision(X[j], X[j+1], W[j], W[j+1])) {
						W[j] = 2;
						W[j+1] = 1;
						j++;
					}
					else {
						if(j == 0) continue;
						else X[j] = moveAnt(X[j], W[j], L);
					}
				}
			}
		}

		for(int i = 0; i < N; i++) {
			System.out.println(X[i]);
		}
	}

	public static boolean collision(int pa, int pb, int da, int db) {
		if(pa+1 == pb && da == 1 && db == 2) {
			return true;
		}else return false;
	}

	public static int moveAnt(int pa, int da, int length) {
		if(da == 1) {
			if(pa == length-1) return 0;
			else return pa+1;
		}else if(da == 2) {
			if(pa == 0) return length-1;
			else return pa-1;
		}
		else return pa;
	}

}
