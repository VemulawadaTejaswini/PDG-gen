import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveC();
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
	Scanner sc = new Scanner(System.in);
	int[] a = new int[3];
	a[0] = sc.nextInt();
	a[1] = sc.nextInt();
	a[2] = sc.nextInt();

	Arrays.sort(a);

	int ans1 = a[2] - a[1];
	int ans2 = a[2] - a[0] + ans1;
	int ans = ans1 + ans2/2 + ans2%2;

	System.out.println(ans);

    }
}
