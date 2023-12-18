import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ans = 0;
    int now = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(i == 0){
        now = n;
        ans++;
      }else{
        if(n >= now){
          now = n;
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}