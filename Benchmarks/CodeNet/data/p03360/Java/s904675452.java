import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	System.out.println(A <= B ? A: A-1);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int[] n = new int[3];
	for(int i=0; i < 3; i++){
	    n[i] = sc.nextInt();	    
	}
	Arrays.sort(n);

	int k = sc.nextInt();

	for(int i=0; i < k; i++){
	    n[2] = n[2] * 2;	    
	}

	System.out.println(n[0] + n[1] + n[2]);
    }
}