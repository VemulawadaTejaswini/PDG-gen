import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	int n1 = Integer.parseInt(S.substring(0, 2));
      	int n2 = Integer.parseInt(S.substring(2, 4));
      	
      	if(n1 >= 13 && n2 >= 13 || n1 >= 13 && n2 <= 0
          || n1 <= 0 && n2 >= 13) {
        	System.out.println("NA");  
        } else if(n1 <= 12 && n2 <= 12) {
        	System.out.println("AMBIGUOUS");
        } else if(n1 >= 13) {
        	System.out.println("YYMM");
        } else {
          	System.out.println("MMYY");
        }     
    }
}