import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    // 10^15 * 5日後のK文字目を探す
    // 普通にループしたのでは、間に合わないので算出する方法を探す
    // 3 -> 333, 4 -> 4444

    // 1234 -> 1223334444
    // int sum = S.Sum(x => int.Parse(x));
    // s => S.Sum(x => Math.pow(x, i)); (i := 日数)
    // 1234 => 1223334444 => 122223333333334444444444444444
    // sum => 1 + 2^1 + 3^1 + 4^1 => 1 + 2^2 + 3^2 + 4^2 => x + y^i (x == 1 && y > 1)
    // x + y^i + z^i  >= K
    // x^i >= 10
    // 2^i >= 10
    // i log10(2) >= 1
    // i >= log10(2)
    String S = sc.next();
    Stream<Integer> firstSSum = S.chars().mapToObj(x -> (int)(x - '0'));
    int K = sc.nextInt();
    int sum = firstSSum.reduce(0, (seed, value) -> seed + value);

    int dayNum = S.length() < K ? (int)Math.round( Math.log10(K) / Math.log10(sum) ) : 0;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < S.length(); i++) {
      int tmp =(int)(  S.charAt(i) - '0' );
      for (int j = 0; j < Math.pow(tmp, dayNum); j++) {
        sb.append(tmp);
      }
    }


    System.out.println(sb.toString().charAt(K-1));

  }
}
