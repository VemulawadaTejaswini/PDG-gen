import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		boolean x = true;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i = 0; i < N-1; i++) {
			if(A[i] == A[i+1]) {
				x = false;
			}
		}
		if(x == true) {
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}