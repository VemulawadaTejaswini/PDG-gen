import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
  
  	String S,T;
  	int A,B;
  	String U;
  	
  	Scanner scan = new Scanner(System.in);
  	S = String.valueOf(scan.next());
  	T = String.valueOf(scan.next());
  	A = Integer.parseInt(scan.next());
  	B = Integer.parseInt(scan.next());
  	U = String.valueOf(scan.next());
  	
  	if(U == S){
      A--;
    } else if (U == T){
      B--;
    }
  
  	System.out.println(String.valueOf(A) + " " + String.valueOf(B));
    }
}
  