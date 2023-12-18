import java.util.*;
import java.math.BigInteger;
  class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  
      long a = sc.nextInt();
      long b = sc.nextInt();
      long x = sc.nextInt();
      long count = 0;
      
      System.out.println(f(b,x) - f(a-1,x));
  }
    
    
    public static long f(long n,long d){
      if(n == -1){
        return 0;
      }else{
        return f2(n,d);
      }
    }
    
    public static long f2(long n, long d){
      
      long count = 0;
      
       for(long i=1;i<=n;i++){
        if(i%d == 0){
          count += 1;
        }
      }
      return count;
    }
      
}