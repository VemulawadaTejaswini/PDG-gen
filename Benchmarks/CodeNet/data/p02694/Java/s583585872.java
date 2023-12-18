
import java.util.*;
public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		
		long n = sc.nextLong();
		long temp = 100;
		int an = 0 ;
            while(n >= temp) {
            	temp = (temp*101 )/100;
            	an++;
            }
		
		
		System.out.println(an);
		
}
}