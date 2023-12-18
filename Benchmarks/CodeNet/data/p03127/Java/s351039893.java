import java.util.Scanner;

public class Main_118C {

	public static void main(String[] args) {
		int N, Min=0, Check, T;
		int A[];
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}
		
		for(int i=0; i<N-1; i++) {
			Min = Math.min(A[i], A[i+1]);
		}
		
		//mod roop
		while(true) {
			Check = Min;
			for(int i=0; i<N; i++) {
				T = A[i] % Check;
				if(T != 0 && T < Min)	Min = T;
			}
			if(Check == Min)	break;
		}
		System.out.print(Min);
	}

}
