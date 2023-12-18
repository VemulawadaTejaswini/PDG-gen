import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner.in(System.in);
    int num = in.nextInt();
    int[] count = new int[3];
    while(in.hasNextInt()) {
      int tmp = in.nextInt() & 3;
      if ((tmp & 1) == 1) {
        count[0]++;
      } else if (((tmp ^ 2) & 3) == 1) {
        count[1]++;
      } else {
        count[2]++;
      }
    }
    String ans = "Yes";
    int t = count[1] > 0 ? 1 : 0;
    if (count[2] + 1 < count[0] + t) ans = "No"; 
    System.out.println(ans);
  }
}
        