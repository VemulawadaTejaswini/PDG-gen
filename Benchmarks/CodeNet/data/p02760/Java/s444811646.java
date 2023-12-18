import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int A[] = new int[9];
		for(int i = 0; i < 9; i++) {
			A[i] = sc.nextInt();
		}
		int N = sc.nextInt();
		int B[] = new int[N];
		for(int i =0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		boolean E[] = {false,false,false,false,false,false,false,false,false};
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < N; j++) {
				if(A[i] == B[j]) {
					E[i] = true;
					break;
				}
				
			}			
		}
		if(E[0] == true && E[3] == true && E[6] == true) {
			System.out.println("YES");
		}
		else if(E[1] == true && E[4] == true && E[7] == true) {
			System.out.println("YES");
		}
		else if(E[2] == true && E[5] == true && E[8] == true) {
			System.out.println("YES");
		}
		else if(E[0] == true && E[1] == true && E[2] == true) {
			System.out.println("YES");
		}
		else if(E[3] == true && E[4] == true && E[5] == true) {
			System.out.println("YES");
		}
		else if(E[6] == true && E[7] == true && E[8] == true) {
			System.out.println("YES");
		}
		else if(E[0] == true && E[4] == true && E[8] == true) {
			System.out.println("YES");
		}
		else if(E[2] == true && E[4] == true && E[6] == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
	}
}