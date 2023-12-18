import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
    long ans;
    
    if((a-b)%2==0){//端以外で合流できる場合
      ans = (b-a)/2;
    }else{
      ans = Math.min(a-1,n-b)+1;
      ans += (b-a-1)/2;
    }
    
    System.out.println(ans);
    
  }
}