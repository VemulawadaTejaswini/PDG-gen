
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      List<List<Integer>> list = new ArrayList<>();
      for (int i = 0; i < N; i++) {
          int key = sc.nextInt();
          int value = sc.nextInt();
          List<Integer> temp = Arrays.asList(key, value);
          list.add(temp);
      }
      list = list.stream().sorted((o1, o2) -> o1.get(0).compareTo(o2.get(0))).collect(Collectors.toList());
      int current = 0;
      int num = M;
      long result = 0;
      while(true) {
          if (list.get(current).get(1) < num) {
              result += list.get(current).get(0) * list.get(current).get(1);
              num -= list.get(current).get(1);
              current++;
          } else {
              result += (long) list.get(current).get(0) * (long) num;
              break;
          }
      }
      System.out.println(result);
  }
}