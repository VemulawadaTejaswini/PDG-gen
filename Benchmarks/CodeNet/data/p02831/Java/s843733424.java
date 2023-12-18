import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextInt();
    long b = sc.nextInt();
    
    long low;
    long high;
    
    if (a<b) {
      low = a;
      high = b;
    }
    else {
      low = b;
      high = a;
    }
    
    boolean flg = true;
    while (flg) {
      flg = false;
      if (low>=2) {
        for (long i=2; i<=low; i++) {
          if (low%i==0) {
            if (high%i==0) {
              low /= i;
              flg = true;
              break;
            }
          }
        }

      }
    }
    
    long result = high * low;
    System.out.println(high * low);
  }
}