import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long m = scan.nextLong();
    long x = 0;
    long y = 0;
    long z = 0;
    if(n % 2 == 0){
      x = n/2;
      System.out.println(x * m);
      z++;
    }
    else{
      x = n/2 + 1;
      if(m % 2 == 0){
        y = m/2;
        long a = (x * y) + ((x-1) * y);
        System.out.println(a);
      }
      else{
        y = m/2 + 1;
        long a = (x * y) + ((x-1) * (y-1));
        System.out.println(a);
      }
    }
  }
}