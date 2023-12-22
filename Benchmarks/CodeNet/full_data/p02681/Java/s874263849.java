import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
      	String T = sc.next();
      	int n = S.length();
      	String T2 = T.substring(0,n);
        if(T2.equals(S))
 	      System.out.println("Yes");
     	else
          System.out.println("No");
    }
}