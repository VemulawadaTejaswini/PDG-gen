import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] C = S.toCharArray();
    if (C[0] == C[1] && C[1] == C[2]) System.out.println("No");
    else System.out.println("Yes");
    
  }
}
