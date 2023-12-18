import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			
			int[] V = new int[N];
			for(int i = 0; i < N; i++) {
				V[i] = Integer.parseInt(sc.next());
			}
			int[] C = new int[N];
			for(int i = 0; i < N; i++) {
				C[i] = Integer.parseInt(sc.next());
			}
			
			int ret = 0;
			for(int i = 0; i < N; i++) {
				if(V[i] > C[i]) ret += V[i] - C[i];
			}
			
			System.out.println(ret); 
		} // Scanner Close
	}
}