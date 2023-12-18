import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);


		       int hati = sc.nextInt();
		       int juu = sc.nextInt();

		       for(int i = 1; i <= 1000;i++) {
		    	   if((int)(i*0.08) ==hati && (int)(i*0.1) ==juu) {
		    		   System.out.println(i);
		    		   return;
		    	   }
		       }
		       System.out.println("-1");



	}
		}

