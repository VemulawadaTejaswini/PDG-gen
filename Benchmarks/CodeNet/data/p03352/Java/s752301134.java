import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int X = s.nextInt();
    int ans = solve(X);
    System.out.println(ans);
  }

  public static int solve(int X){
    int ans = 0;
    for(int b = 1; b <= 32 ; b++){
      for(int p = 2; p <= 32 ; p++){
        if(Math.pow(b,p) > X)break;
        if(ans < Math.pow(b,p)){
          ans = (int)Math.pow(b,p);
        }
      }
    }
    return ans;
  }
}
