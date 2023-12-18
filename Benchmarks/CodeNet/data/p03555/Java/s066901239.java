import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1,s2;
    boolean eq = true;
    
    s1 = sc.next();
    s2 = sc.next();
    
    for(int i = 0;i < 3 && eq;i++){
      if(s1.charAt(i) != s2.charAt(2-i)) eq = false;
    }
        
    if(eq) System.out.println("YES");
    else System.out.println("NO");
  }
}
