
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    int M = sc.nextInt();

    List<Integer> aiList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      aiList.add(sc.nextInt());
    }

    long sum = aiList.stream().mapToLong(i -> i).sum();
    long count = aiList.stream().filter(i -> i > (sum / (4 * M))).count();

    // 出力
    System.out.println(count >= M ? "Yes" : "No");
  }
}
