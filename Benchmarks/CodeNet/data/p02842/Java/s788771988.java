import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
 double tmp = (double)n / 1.08;
      int tmp2 = (int)tmp;
if (tmp2 * 1.08 == n) {
  System.out.println(tmp2);
} else {
  System.out.println(":(");
}
    }
}