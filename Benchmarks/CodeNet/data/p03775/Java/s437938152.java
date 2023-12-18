import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
	    int nlen = String.valueOf(n).length(); 
	    for (int i = 1; i * i <= n; i++) {    
	        if (n % i == 0) {      
	            if (i != n / i) {
	                if (String.valueOf(n/i).length() < nlen ){
	                	nlen = String.valueOf(n/i).length();
	                }
	            }
	        }
	    }
	    System.out.println(nlen);
	    
	    
	}

}