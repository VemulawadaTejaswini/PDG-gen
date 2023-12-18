import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
	if (s.contains("a") && s.contains("b") && s.contains("c"))
	    {
		System.out.println("Yes");
	    }
	else {
	    System.out.println("No");
	}
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    	int b = sc.nextInt();
	int k = sc.nextInt();

	for(int i=a; i <= b; i++){
	    if (i<a+k || i>b-k) System.out.println(i);
	}
    }
    private void solveC() {	
    }
}
