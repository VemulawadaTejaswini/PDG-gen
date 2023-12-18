
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
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int ai = sc.nextInt();
      aiList.add(ai);
      sum += ai;
    }

    int count = 0;
    for(int ai : aiList) {
      if(ai > (sum / (4 * M))) {
        count++;
      }
    }
    // 出力
    System.out.println(count >= M ? "Yes" : "No");
  }
}
