import java.util.*;

public class Main{
  public static void main(Stinrg[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.lenght()-2;
    char s1 = S.charAt(0);
    char s2 = S.charAt(S.length()-1);
    System.out.println(s1+len+s2);
  }
}
    
    
