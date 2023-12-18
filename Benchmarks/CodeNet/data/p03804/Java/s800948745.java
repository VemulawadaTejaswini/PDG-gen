import java.util.*;

public class Main {
		static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] A = new String[N];
		String[] B = new String[M];
		for (int i = 0; i < N; i++) {
			A[i] = sc.next();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.next();
		}
		int k = 0;
		int count = 0;
		int l=0;
		for (int i = 0; i < N; i++) {
			for (int j =0; j <= N-M; j++) {
				if(A[i].substring(j,  j + M).equals(B[k])) {
					k++;
					count++;
					break;
				}
			}
			if(count==M){
				break;
			}
		}
		if(count!=0){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
		
	}

