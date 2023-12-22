import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int r;

	            r = sc.nextInt();
	            double mm,en;
	            en=2*r*3.14159265;
	            mm=r*r*3.14159265;
	            
	            System.out.printf("%f %f",en,mm);
	           
	            sc.close();
	    }
	}
