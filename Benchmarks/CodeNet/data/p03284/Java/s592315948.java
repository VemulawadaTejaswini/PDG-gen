
import java.util.*;

public class Main {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    System.out.println(N % K == 0 ? 0 : 1);
  }
}
