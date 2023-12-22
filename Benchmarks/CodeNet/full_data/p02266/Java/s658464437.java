
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      solve(sc);
    }
  }

  static void solve(Scanner sc) {
    ArrayDeque<Integer> idxList = new ArrayDeque<>();
    ArrayDeque<Puddle> areaStuck = new ArrayDeque<>();// 水たまりスタック
    char[] input = sc.next().toCharArray();

    for (int i = 0; i < input.length; i++) {
      if (input[i] == '\\') {
        idxList.push(i);
      } else if (input[i] == '/' && idxList.size() > 0) {
        // 水たまりができたら、対応する\の位置と面積をつど求める
        int j = idxList.pop();
        int tmp = i - j;
        // もっと大きい水たまりができるなら、スタックから取り出して集約する
        while (areaStuck.size() > 0 && areaStuck.peek().beginIndex > j) {
          Puddle stuck = areaStuck.pop();
          tmp += stuck.area;
        }
        areaStuck.push(new Puddle(i, tmp));
      }
    }

    int sum = 0, cnt = areaStuck.size();
    StringBuilder sb = new StringBuilder();
    while (!areaStuck.isEmpty()) {
      int tmp = areaStuck.removeLast().area;
      sb.append(tmp).append(' ');
      sum += tmp;
    }
    System.out.println(sum);
    System.out.print(cnt);
    System.out.println(sb.length() > 0 ? (" " + sb.toString().trim()) : "");
  }
}

class Puddle {
  int beginIndex;
  int area;

  Puddle(int beginIndex, int area) {
    this.beginIndex = beginIndex;
    this.area = area;
  }
}

