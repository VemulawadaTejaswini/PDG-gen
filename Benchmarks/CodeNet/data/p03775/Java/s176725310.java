import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long ans = min(N);
    for(long i=1; i*i<=N; i++){
      if(N%i!=0)continue;
      long b = N/i;
      long temp = min(Math.max(i, b));
      if(temp<ans){
        ans=temp;
      }
    }
    System.out.print(ans);
  }
  
  static long min(long N){
    return String.valueOf(N).length();
  }
}

  
