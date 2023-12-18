import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long t1 = Long.parseLong(sc.next());
    long t2 = Long.parseLong(sc.next());
    long a1 = Long.parseLong(sc.next());
    long a2 = Long.parseLong(sc.next());
    long b1 = Long.parseLong(sc.next());
    long b2 = Long.parseLong(sc.next());
    
    long s1 = t1 * (a1 - b1);
    long s2 = t2 * (a2 - b2);
    
    long sprev = 0;
    long snow  = 0;
    long s     = 0;
    long ans = 0;
    int cnt = 0;

    if(s1 + s2 == 0){
      System.out.println("infinity");
      return;
    }
    
    s = s1 + s2;

    System.out.println(Math.abs(s1 *2  / s));
    
  }
}
