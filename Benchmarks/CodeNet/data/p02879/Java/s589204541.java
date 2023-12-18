import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     int A = Integer.valueOf(chars[0]);
	     int B = Integer.valueOf(chars[1]);
	     if(0<A&A<10) {
	    	 if(0<B&B<10) {
	    		 System.out.println(A*B);
	    		 return;
	    	 }
	     }
	     System.out.println(-1);
	}

}
