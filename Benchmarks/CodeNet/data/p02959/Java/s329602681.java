import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long[] Ai = new long[N+1];
    	for (int i = 0; i < Ai.length; i++) {
    		Ai[i] = sc.nextLong();
    	}
    	long tmp = 0;
    	long hunt = 0;
    	for (int i = 0; i < N; i++) {
    		long B = sc.nextLong();
    		long Btmp = B + tmp;
    		if (Ai[i] <= Btmp) {
    			if (Ai[i] <= tmp) {
    				tmp = B;
    			} else {
    				tmp = Btmp - Ai[i];
    			}
    			hunt += Ai[i];
    		} else {
    			tmp = 0;
    			hunt += Btmp;
    		}
    	}
    	if (Ai[N] <= tmp) {
    		hunt += Ai[N];
    	} else {
    		hunt += tmp;
    	}
    	System.out.println(hunt);
    }
}