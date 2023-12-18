import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int Lin = 0;
    	int Rin = Integer.MAX_VALUE;
    	for (int i = 0; i < M; i++) {
    		int L = sc.nextInt();
    		int R = sc.nextInt();
    		if (Lin < L) {
    			Lin = L;
    		}
    		if (R < Rin) {
    			Rin = R;
    		}
    	}
    	System.out.println(Lin <= Rin ? Rin - Lin + 1 : 0);
    }
}