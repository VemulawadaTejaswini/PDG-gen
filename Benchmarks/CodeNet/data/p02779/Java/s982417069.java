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
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(A[i] == A[j]) {
					x = false;
					break;
				}
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