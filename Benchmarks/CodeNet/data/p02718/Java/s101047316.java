import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int M = cin.nextInt();
		int[] A = new int[1100];
		
		for(int i = 0;i<N;i++) A[i] = cin.nextInt();
		int sum = 0;
		for(int i = 0;i<N;i++) sum += A[i];

		int count = 0;
		for(int i = 0;i<N;i++) {
			int a = A[i]*4*M;
	
			if(a>=sum) count++;
		}
		
		if(count >= M) System.out.println("Yes");
		else System.out.println("No");

	}

}
