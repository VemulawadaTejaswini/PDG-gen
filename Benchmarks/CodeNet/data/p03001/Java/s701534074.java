import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long w = sc.nextLong();
    long h = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();
    int l = 0;
    double a = w*h/2.0;
    
    if(x*2 == w && y*2 == h) l = 1;
    
  	System.out.println(a + " " + l);
    
    
  }
}
