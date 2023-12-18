import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      String S = sc.next();
	      sc.close();
	      
	      int price = 700;
	      
	      for(int i = 0; i < 3; i++) {
	    	  	if(S.charAt(i) == 'o') {
	    	  		price += 100;
	    	  	}
	      }
	      
	      System.out.println(price);
	      System.exit(0);
	    }

}