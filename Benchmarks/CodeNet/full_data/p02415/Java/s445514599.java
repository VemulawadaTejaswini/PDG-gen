import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	    	    String S = sc.nextLine();
	    	    char[] ch = S.toCharArray();
	    	    
	    for(char test:ch){
	    if(Character.isUpperCase(test)) 
          System.out.print(Character.toLowerCase(test));
	    else System.out.print(Character.toUpperCase(test));
	    }
	    System.out.println();
	  }
}

