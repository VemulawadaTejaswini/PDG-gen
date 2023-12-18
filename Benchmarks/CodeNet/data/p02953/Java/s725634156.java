import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N < 2) {
    	System.out.println("Yes");
    }
    else {
    	int a, b;
    	String output = "Yes";
    	a = sc.nextInt();
    	b = sc.nextInt();
    	for(int i = 2; i < N; i++) {
    		int c = sc.nextInt();
    		if(c - a <= -2) {
    			output = "No";
    			break;
    		}
    		a = b;
    		b = c;
    	}
    	System.out.println(output);
    }
  }
}