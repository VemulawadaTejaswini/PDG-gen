import java.util.*;
 
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
	int cnt = 0;
	long top = 0;

	while(n > 0){
	    top = n % 10;
	    n /= 10;
	    cnt ++;
	}
	long ans = top + (cnt-1) * 9 - 1;
	System.out.println(ans);
    }
}