import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int count = 0;
    	if (A == B && B == C && C == A) {
    		System.out.println(-1);
    	} else {
        	while (A%2 == 0 && B%2 == 0 && C%2 == 0) {
        		int a = A;
        		int b = B;
        		int c = C;
        		A = b/2 + c/2;
        		B = a/2 + c/2;
        		C = a/2 + b/2;
        		count++;
        	}
        	System.out.println(count);
    	}
    }
}