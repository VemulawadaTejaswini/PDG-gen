import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
                int arrA[] = new int[N];
		int ope = 0;
        
        for (int i = 0; i < N; i++) {
			arrA[i] = sc.nextInt();
		}
        
        
        for (int i = 1; i < N; i++) {
        	if ( (arrA[i-1] + arrA[i]) > x ) {
        	    if ( arrA[i-1] > x ) {
        	    	ope += (arrA[i-1] - x);
        	    	arrA[i-1] = x;
        	    }

        	    	if ( (arrA[i-1] + arrA[i]) > x ) {
        	    		ope += (arrA[i-1] + arrA[i] - x);
                	    arrA[i] = arrA[i-1] - x;
        	    	}
        	}
        }
        
        System.out.println(ope);
        
		sc.close();
	}
}
