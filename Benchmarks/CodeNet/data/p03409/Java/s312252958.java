
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static List<Pair<Integer, Integer>> red = new ArrayList<>();
  static List<Pair<Integer, Integer>> blue = new ArrayList<>();
  static int n;

  public static void main(String[] args) {
    n = sc.nextInt();
    red = new ArrayList<>();
    blue = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      red.add(new Pair<>(x, y));
    }
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      blue.add(new Pair<>(x, y));
    }
    Collections.sort(red, new Comparator<Pair<Integer, Integer>>() {
      @Override public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return o1.getKey() - o2.getKey();
      }
    });
    Collections.sort(blue, new Comparator<Pair<Integer, Integer>>() {
      @Override public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return o1.getKey() - o2.getKey();
      }
    });

    int answer = 0;
    answer = search(0, 0, answer);
    System.out.println(answer);
  }

  private static int search(int i, int j, int answer) {
    if (i == n || j == n) {
      return answer;
    }
    if ((red.get(i).getKey() < blue.get(j).getKey()) && (red.get(i).getValue() < blue.get(j)
      .getValue())) {
      answer++;
      i++;
      j++;
      search(i, j, answer);
    } else {
      answer = Math.max(search(i + 1, j, answer), search(i, j + 1, answer));
    }
    return answer;
  }
}
