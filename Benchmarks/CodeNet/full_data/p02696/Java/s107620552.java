import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long max = 0;
    
    for(long i=n; i>0; i--){
      long y = (long)(Math.floor(a*i/b)-a*Math.floor(i/b));
      if(y>max){
        max = y;
      }
    }
    System.out.println(max);
  }
}