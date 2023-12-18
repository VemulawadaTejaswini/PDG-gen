import java.util.*;

public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveA();
    }
    
    private void solveA() {
    	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a,b;

	if (n%10 == 0){
	    a = b = n/2;
	}
	else{
	    int d = 10;
	    while(d*10 <= n){
		d *= 10;
	    }
	    a = (n/d) * d;
	    b = n%d;
	}
	
	int ans = 0;
	while(a != 0){
	    ans += a%10;
	    a /= 10;
	}

	while(b != 0){
	    ans += b%10;
	    b /= 10;
	}
	
    	System.out.println(ans);
    }
}