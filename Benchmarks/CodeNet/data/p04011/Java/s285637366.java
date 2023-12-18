import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int K = Integer.parseInt(sc.nextLine());
    int X = Integer.parseInt(sc.nextLine());
    int Y = Integer.parseInt(sc.nextLine());
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(i < K){
        ans += X;
      }else{
        ans += Y;
      }
    }
    System.out.println(ans);
  }
}