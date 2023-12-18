import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    long ans = 0;
    long x = a%2 == 0 ? a/2 : a/2+1;
    long y = b%2 == 0 ? b/2 : b/2+1;
    if(x-y == 1){
      ans = 1;
    }else if(x == y){
      ans = 0;
    }else{
      if((a+b)%2 == 0){
        ans = b-(a+b)/2;
      }else{
        ans = Math.max(Math.min(x, N-x), Math.min(y, N-y));
      }
    }
    System.out.println(ans);
  }
}