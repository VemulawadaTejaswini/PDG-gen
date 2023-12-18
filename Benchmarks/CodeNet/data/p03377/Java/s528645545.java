import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	int X = sc.nextInt();	
    	System.out.println(A > X ? "NO" : (A+B >= X ? "YES" : "NO"));
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	System.out.println();
    }
    private void solveC() {
	Scanner sc = new Scanner(System.in);
	System.out.println();
    }
    private void solveD() {
	Scanner sc = new Scanner(System.in);
	System.out.println();
    }
}