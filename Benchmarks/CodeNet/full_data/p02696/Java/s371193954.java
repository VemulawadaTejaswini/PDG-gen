import java.util.*;

public class Main0 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int N = Integer.parseInt(sc.next());
      double ans = 0;
      if(N > B){
        ans = Math.floor(A*(B-1)/B) - A * Math.floor((B-1)/B);
        System.out.println((int)ans);

      }else{
        ans = Math.floor(A*N/B) - A * Math.floor(N/B);
        System.out.println((int)ans);

      }
  }
}
