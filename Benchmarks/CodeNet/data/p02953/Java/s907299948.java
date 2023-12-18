import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();


    int prev = -1000000000;

    for (int i = 0; i < N; i++) {

      if (H[i] - 1 >= prev) {
        H[i]--;
        prev = H[i];
      } else {
        if (i < N-1){
          if (H[i] > H[i+1]){
            System.out.println("No");
            return;
          }
        }
      }

    }

    System.out.println("Yes");
    
  }

}