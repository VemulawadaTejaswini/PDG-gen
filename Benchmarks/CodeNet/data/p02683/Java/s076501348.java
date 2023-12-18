import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    List<Integer> list = new ArrayList<>();

    int[][] matrix = new int[N][M + 1];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M + 1; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int iChange = 0; iChange < N; iChange++) {
      for (int j = 1; j < M; j++) {
        int skillSum = 0;
        int priceSum = 0;
        for (int i = iChange; i < N; i++) {
          if (skillSum >= X) {
            break;
          }
          skillSum += matrix[i][j];
          priceSum += matrix[i][0];
        }
        if (skillSum < X) {
          priceSum = 2147483647;
        }
        list.add(priceSum);
        if (priceSum == 2147483647) {
          break;
        }
      }
    }

    int MIN = list.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);

    if (MIN == 2147483647) {
      System.out.println(-1);
    } else {
      System.out.println(MIN);
    }

    list.stream().forEach(System.out::println);
  }
}
