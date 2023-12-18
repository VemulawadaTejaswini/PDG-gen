import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
    int mozi = 0;
    
    for (int i = 0; i < N ;i++) {
      mozi = S.charAt(i);
      if (mozi == 65) {
        i++;
        mozi = S.charAt(i);
        if(mozi == 66) {
          i++;
          mozi = S.charAt(i);
          if (mozi == 67) {
            count++;
          }
        }
      }
    }
    System.out.print(count);
  }
}