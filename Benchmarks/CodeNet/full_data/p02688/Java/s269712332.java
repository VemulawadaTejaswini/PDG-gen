
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // スペース区切りの整数の入力
    int N = sc.nextInt();
    int K = sc.nextInt();

    List<Integer> nList = IntStream.range(1, N + 1).boxed().collect(Collectors.toList());

    for (int i = 0; i < K; i++) {
      // 整数の入力
      int di = sc.nextInt();
      for (int j = 0; j < di; j++) {
        int A = sc.nextInt();
        int index = nList.indexOf(A);
        if (index != -1) {
          nList.remove(index);
        }
      }
    }

    System.out.println(nList.size());
  }
}
