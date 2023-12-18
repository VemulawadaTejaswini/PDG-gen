import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] S = scanner.nextLine().split(" ");
    scanner.close();
    int N = Integer.valueOf(S[0]);
    int A = Integer.valueOf(S[1]);
    int B = Integer.valueOf(S[2]);
    int blueCount = 0;
    int allCount = 0;
    while(allCount + A <= N) {
        blueCount += A;
        allCount += A + B;
    }
    if(N >= allCount) {
        blueCount += N - allCount;
    }
    System.out.println(blueCount);
  }
}
