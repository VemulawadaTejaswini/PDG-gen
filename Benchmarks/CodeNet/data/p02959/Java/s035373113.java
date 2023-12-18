import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] Ai = new int[N+1];
    	for (int i = 0; i < Ai.length; i++) {
    		Ai[i] = sc.nextInt();
    	}
    	long tmp = 0;
    	long hunt = 0;
    	for (int i = 0; i < N; i++) {
    		int B = sc.nextInt();
    		if (Ai[i] <= B + tmp) {
    			if (Ai[i] <= tmp) {
    				tmp = B;
    			} else {
    				tmp = B + tmp - Ai[i];
    			}
    			hunt += Ai[i];
    		} else {
    			tmp = 0;
    			hunt += B + tmp;
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