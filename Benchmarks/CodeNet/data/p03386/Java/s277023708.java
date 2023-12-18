import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int K = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	for (int i = A; i < K+A; i++) {
    		sb.append(i + "\n");
    	}
    	for (int i = B; B-K < i; i--) {
    		sb.append(i + "\n");
    	}
    	System.out.println(sb);
    }
}