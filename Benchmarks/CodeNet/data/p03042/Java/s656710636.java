import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	int L = Integer.parseInt(S.substring(0, 2));
      	int R = Integer.parseInt(S.substring(2, 4));

      	if(L >= 13 && R == 0 || L == 0 && R >= 13
          	|| L == 0 && R == 0) {
        	System.out.println("NA");  
        } else if(L <= 12 && R <= 12) {
        	System.out.println("AMBIGUOUS");
        } else if(L >= 13) {
        	System.out.println("YYMM");  
        } else {
        	System.out.println("MMYY");  
        }
    }
}