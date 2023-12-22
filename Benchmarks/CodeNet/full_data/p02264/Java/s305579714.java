
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      Queue<Prosess> queue = new ArrayDeque<>();
      int N = sc.nextInt();
      int q = sc.nextInt();
      int time = 0;

      for (int i = 0; i < N; i++) {
        queue.offer(new Prosess(sc.next(), sc.nextInt()));
      }

      while (queue.size() != 0) {
        Prosess p = queue.poll();
        if (p.time > q) {
          // クオンタムだけ処理
          queue.offer(new Prosess(p.name, p.time - q));
          time += q;
        } else {
          // 処理が終わっていれば、名前とここまでかかった時間を表示して終わり
          time += p.time;
          System.out.println(p.name + " " + time);
        }

      }
    }
  }
}

class Prosess {
  String name;
  int time;

  Prosess(String name, int time) {
    this.name = name;
    this.time = time;
  }
}
