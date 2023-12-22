import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		long K = stdIn.nextLong();
		int[] A = new int[N];
		int[] frag = new int[N];
		
		for(int i = 0; i < N; i ++) {
			A[i] = stdIn.nextInt();
			frag[i] = 0;
		}
		
		int idx = 0;
		while(idx < K) {
			if(frag[A[idx] - 1] + 1 != 3) {
				frag[A[idx] - 1] ++;
			}else {
				break;
			}
		}
		
		int num1 = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < frag.length; i ++) {
			if(frag[i] == 2) {
				a.add(i);
			}else if(frag[i] == 1) {
				num1 ++;
			}
		}
		
		System.out.println(A[a.get((int) ((K - num1) % a.size()))]);
	}

}