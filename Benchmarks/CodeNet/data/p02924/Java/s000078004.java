import java.util.Scanner;
     
public class Main {
    	
    private final static Scanner sc = new Scanner(System.in);
    	
    public static void main(String[] arg) {
    	long N  = sc.nextInt();
        long sol = (N)*(N-1)/2;
      	System.out.println(sol);
   	}
}