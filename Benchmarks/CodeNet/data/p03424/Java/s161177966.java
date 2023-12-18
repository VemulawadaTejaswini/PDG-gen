import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      String hina = "Three";
	      String check;
	      for(int i=0; i<n; i++) {
	    	  check = sc.next();
	    	  if(check.equals("Y")) {
	    		  hina = "Four";
	    	  }
	      }
	      System.out.println(hina);
	}

}
