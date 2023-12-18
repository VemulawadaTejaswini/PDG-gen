import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		int K = sc.nextInt();
    		int nc ;
    		if(N%2 == 0) {nc = N/2;}
    		else { nc = N/2+1;}
    		if(nc >= K) System.out.println("YES");
    		else System.out.println("NO");
    		
    		
    		
    		
    		
    		}
    

}
