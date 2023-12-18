import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

  	
  	Scanner scan = new Scanner(System.in);
  	
  	String S = String.valueOf(scan.next());
  	String T = String.valueOf(scan.next());
  	int A = Integer.parseInt(scan.next());
  	int B = Integer.parseInt(scan.next());
  	String U = String.valueOf(scan.next());
  	
  	if(U == S){
      A --;
    } else if (U == T){
      B --;
    }
  
  	System.out.println(String.valueOf(A) + " " + String.valueOf(B));
    }
}
  