import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class State implements Comparable<State> {
		long a;
		State(long a){
			this.a = a;
		}
		public int compareTo(State s) {
			if(a > s.a) {
				return -1;
			}
			return 1;
		}
	}

    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {

    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		int Z = sc.nextInt();
    		long K = sc.nextLong();
    		long[] A = new long[X];
    		long[] B = new long[Y];
    		long[] C = new long[Z];
    		for(int i=0; i<X; i++) {
    			A[i] = sc.nextLong();
    		}
    		for(int i=0; i<Y; i++) {
    			B[i] = sc.nextLong();
    		}
    		for(int i=0; i<Z; i++) {
    			C[i] = sc.nextLong();
    		}
    		Arrays.sort(A);
    		Arrays.sort(B);
    		Arrays.sort(C);
    		PriorityQueue<State> pq = new PriorityQueue<State>();
    		for(int a=X-1; a>=0; a--) {
    			for(int b=Y-1; b>=0; b--) {
    				for(int c=Z-1; c>=0; c--) {
    					if((X-a)*(Y-b)*(Z-c)>K) break;
    					pq.add(new State(A[a]+B[b]+C[c]));
    				}
    			}
    		}
    		for(int i=0; i<K; i++) {
    			System.out.println(pq.remove().a);
    		}
    	}
    }
}
