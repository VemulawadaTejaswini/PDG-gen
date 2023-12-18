import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();

    sc.close();

    long v = gcd(a, b);

    long count = 1;

    for(long i = 1; i <= v; i++){
      if(v % i == 0){
        if (isPrimeNum(v / i)){
          count++;
        }
      }
    }

    System.out.println(count);
    
  }

  public static long gcd(long x, long y){

    if (x < y) {
      long t = x;
      x = y;
      y = t;
    }
  
    while (y > 0) {
      long r = x % y;
      x = y;
      y = r;
    }
  
    return x;
  
  }

  static boolean isPrimeNum(long x) {

    if(x == 2) {
      return true;
    }

    if(x < 2 || x % 2 == 0) {
      return false;
    }

    for(long n = 3; n <= Math.sqrt((double)x); n += 2) {
      
      if(x % n == 0) {
        return false;
      }
    
    }

    return true;

  }

}