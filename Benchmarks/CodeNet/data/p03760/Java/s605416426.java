import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String O = sc.next(), E = sc.next();
    int o = O.length(), e=E.length();
    
    for(int i=0; i<e; i++) {
        System.out.print(O.substring(i,i+1));
        System.out.print(E.substring(i,i+1));
    }
    if(o!=e) {
      System.out.print(O.substring(o-1,o));
    }
  }
}