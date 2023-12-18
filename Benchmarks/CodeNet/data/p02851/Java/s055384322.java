import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
    	int N = nextInt();
    	int K = nextInt();
    	int[] A = new int[N];
    	int Answer = 0;

    	for (int i = 0; i < N; i++) {
    		int test = nextInt() % K;
    		if (test == 1) {
    			Answer++;
    		}
    		A[i] = test;
    	}

    	for (int i = 2; i <= N; i++) {
    		for (int j = 0; j <= (N - i); j++) {
    			double aaa = 0;
    			for (int k = 0; k < i; k++) {
    				aaa += A[j + k];
    			}
    			if (aaa % K == i) {
    				Answer++;
    			}
    		}
    	}
    	println(Answer);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }
}