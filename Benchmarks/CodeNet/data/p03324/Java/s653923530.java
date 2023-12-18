import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();//0,1,2
    int N = sc.nextInt();
    
    int ans = N;
    if (D == 0 && N == 100) {
            ans++;
        } else if (0 < D) {
            for (int i = 0; i < D; i++) {
                ans *= 100;
            }
            if (N == 100) {
                int add = 1;
                for (int i = 0; i < D; i++) {
                    add *= 100;
                }
                ans += add;
            }
        }
    System.out.println(ans);
  }
}
    