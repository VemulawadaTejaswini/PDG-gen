import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    long[] H = new long[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextLong();
    }

    sc.close();

    String ans = "Yes";

    for (int i = 1; i < N; i++) {

      if (H[i-1] > H[i]){
        ans = "No";
        break;
      } else if (i < N-1){
        if (H[i] > H[i+1]) {
          if (H[i] - H[i+1] == 1) {
            if ((H[i] != H[i-1])) {
              H[i] -= 1;
            } else {
              ans = "No";
              break;
            }
          } else {
            ans = "No";
            break;
          }
        }
      }
    }

    System.out.println(ans);
    
  }

}