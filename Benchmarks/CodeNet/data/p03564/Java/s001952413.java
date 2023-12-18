import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int K = Integer.parseInt(sc.nextLine());
    int ans = 1;
    for(int i = 0; i < N; i++){
      if(ans < K){
        ans *= 2;
      }else{
        ans += K;
      }
    }
    
    System.out.println(ans);
  }
}