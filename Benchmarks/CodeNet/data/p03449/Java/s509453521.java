
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		
		int A[] = new int[n+1];
		int B[] = new int[n+1];
		for(int i =0 ; i < n ;i++){
			A[i+1] = A[i]+sc.nextInt(); 
		}
		for(int i =0 ; i < n ;i++){
			B[i+1] = B[i]+sc.nextInt(); 
		}
		
		int max = 0;
		for(int i = 1 ; i < n+1 ; i++){
			max = Math.max(max,(A[i] + B[n] - B[i-1]));
		}
		
		System.out.println(max);
		
	}
}
