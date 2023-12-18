import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int d = 0;
    int ans = 0;

    for(int i = 0; i < n; i++){
      int l = sc.nextInt();
      d += l;
      if(d <= x){
        ans += 1;
      }
    }

    System.out.println(ans);
  }
}
