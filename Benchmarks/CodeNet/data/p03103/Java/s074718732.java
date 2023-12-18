import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static class Data {
    public final int cost;
    public final int count;

    public Data(int cost, int count) {
      this.cost = cost;
      this.count = count;
    }
  }

  public static void main(String... args) {

    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      List<Data> list = new ArrayList<>();
      for (int i = 0; i < N; ++i) {
        list.add(new Data(sc.nextInt(), sc.nextInt()));
      }
      list.sort((a, b) -> {
        if (a.cost > b.cost) {
          return 1;
        }
        if (a.cost < b.cost) {
          return -1;
        }
        return 0;
      }); 

      int total = 0;
      for (Data d : list) {
        if (d.count < M) {
          total += d.cost * d.count;
          M -= d.count;
        } else {
          total += d.cost * M;
          break;
        }
      }
      System.out.println(total);
      
    }
  }

}