import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int Q = sc.nextInt();
    	String S = sc.next();
    	
    	for( int i = 0; i < Q; i++ ) {
    		int l = sc.nextInt();
    		int r = sc.nextInt();
    		int cnt = 0;
    		for( int j = l-1; j < r-1; j++ ) {
    			if( S.substring(j, j+2).equals("AC") ) {
    				cnt++;
    			}
    		}
    		System.out.println( cnt );
    	}
    	
    	sc.close();
    }
}
