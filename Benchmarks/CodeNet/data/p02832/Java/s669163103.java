import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ans = 0;
    int now = 1;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.next());
      if(a != now){
        ans++;
      }else{
        now++;
      }
    }
    if(ans == N){
      ans = -1;
    }
    System.out.println(ans);
  }
}