import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
    String T = sc.next();
      boolean flag = false;
	if(T.startsWith(S)){
      if(T.length() == (S.length() + 1))
        flag = true;
    }
  if(flag)
    System.out.println("Yes");
  else
    System.out.println("No");
    }
      
      
}