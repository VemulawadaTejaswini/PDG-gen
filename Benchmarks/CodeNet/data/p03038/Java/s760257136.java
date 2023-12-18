import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      l.add(scan.nextInt());
    }
    List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());

    for (int i = 0; i < M; i++) {
      int B = scan.nextInt();
      int C = scan.nextInt();
      for (int j = 0; j < N; j++) {
        int sl = sortedList.get(j);
        if (C <= sl) {
          break;
        }
        sortedList.set(j, C);
        B--;
        if (B <= 0) {
          break;
        }
      }
      sortedList = sortedList.stream().sorted().collect(Collectors.toList());
    }
    long result = 0;
    for (Integer i : sortedList) {
      result += i;
    }
    System.out.println(result);
  }
}
