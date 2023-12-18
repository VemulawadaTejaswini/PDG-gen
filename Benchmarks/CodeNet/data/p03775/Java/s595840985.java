import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = min(N);
    for(int i=1; i*i<=N; i++){
      if(N%i!=0)continue;
      int b = N/i;
      int temp = min(Math.max(i, b));
      if(temp<ans){
        ans=temp;
      }
    }
    System.out.print(ans);
  }
  
  static int min(int N){
    return String.valueOf(N).length();
  }
}

  
