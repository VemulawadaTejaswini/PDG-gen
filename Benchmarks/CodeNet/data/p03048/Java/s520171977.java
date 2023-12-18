import java.util.Scanner;
 
public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    int R = sc.nextInt();
	    int G = sc.nextInt();
	    int B = sc.nextInt();
	    int N = sc.nextInt();
	    
	    int cnt = 0;
	    for(int r = 0; r <= N; r++) {
	    	for(int g = 0; g <= N; g++) {
	    		int b = (N-(R*r+G*g))/B;
	    		if(b >= 0 && R*r+G*g+B*b == N) {
	    			cnt++;
	    		}
	    	}
	    }
	    
	    System.out.println(cnt);
	}
}
