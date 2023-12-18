import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(N);
    
    if(N < 2) {
    	System.out.println("Yes");
    }
    else {
    	int a, b, count;
    	String output = "Yse";
    	a = sc.nextInt();
    	count = 0;
    	for(int i = 1; i < N; i++) {
    		b = sc.nextInt();
    		if(b - a < 0) {
    			if(b - (a-1) < 0) {
    				output = "No";
    				break;
    			}
    			else {
    				count++;
    			}
    		}
    		
    		if(count == 2) {
    			output = "No";
				break;
    		}
    		
    		a = b;
    	}
    	System.out.println(output);
    }
  }
}