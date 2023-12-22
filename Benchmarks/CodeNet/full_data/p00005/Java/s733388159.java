import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      String tmp = br.readLine();
      List<Integer> list = Arrays.asList(tmp.split(" ")).stream().map(i -> Integer.valueOf(i)).sorted().collect(Collectors.toList());
      int koyakusu = getKoyakusu(list.get(0), list.get(1));
      int kobaisu = getKobaisu(list.get(0), list.get(1));
      System.out.printf("%d %d", koyakusu, kobaisu);
    } catch (Exception e) {
      System.exit(0);
    }
  }

  // ??¬?´???°?????????
  private static int getKoyakusu(int a, int b) {
    int candidate = a;
    while (b % a != 0) {
      candidate = b % a;
      b = a;
      a = candidate;
    }
    return candidate;
  }

  // ??¬?????°?????????
  private static int getKobaisu(int a, int b) {
    return a * b / getKoyakusu(a, b);
  }
}