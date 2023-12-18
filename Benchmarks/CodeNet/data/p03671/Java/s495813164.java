import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

    Scanner in =new Scanner(System.in);
     int a =in.nextInt();
     int b =in.nextInt();
     int c =in.nextInt();
     int d =a+b;
     int e =a+c;
     int f =b+c;
     if(d>=e) {
    	 if(e>=f) {
    		 System.out.println(f);
    		 }
          else {
    			 System.out.println(e);

    		    }

     }
     else  {
    	 if(d>=f) {
    		 System.out.println(f);

    	 }
    	 else {
    		 System.out.println(d);
    	 }
     }


      }





}
