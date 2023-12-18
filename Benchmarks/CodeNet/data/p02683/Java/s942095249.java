import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();


    List<Input> inputs = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int price = sc.nextInt();
      List<Integer> ms = new ArrayList<>();
      for (int j = 0; j < m; j++) {
        ms.add(sc.nextInt());
      }
      Input input = new Input();
      input.setPrice(price);
      input.setKnowledge(ms);
      inputs.add(input);
    }

    Map<Integer, Integer> understand;
    int total;
    int currentPrice;
    int minPrice = Integer.MAX_VALUE;
    int[] rikaido;
    for (int i = 0; i < n; i++) {
      rikaido = new int[m];
      total = 0;
      understand = new HashMap<>();
      currentPrice = 0;
      for (int k = 0; k < n; k++) {
        if (i != k) {
          Input input = inputs.get(k);
          List<Integer> knowledge = input.getKnowledge();
          currentPrice += input.getPrice();
          for (int l = 0; l < m; l++) {
            rikaido[l] += knowledge.get(l);
            if (rikaido[l] >= x && understand.get(l) == null) {
              understand.put(l, 1);
              total++;
            }
          }
          if (total == m) {
            rikaido = new int[m];
            total = 0;
            understand = new HashMap<>();
            if (minPrice > currentPrice) {
              minPrice = currentPrice;
            }
            currentPrice = 0;
          }
        }
      }
    }

    if (minPrice == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(minPrice);
    }
  }

  private static class Input {
    int price;
    List<Integer> knowledge;

    public void setPrice(int price) {
      this.price = price;
    }

    public void setKnowledge(List<Integer> knowledge) {
      this.knowledge = knowledge;
    }

    public int getPrice() {
      return price;
    }

    public List<Integer> getKnowledge() {
      return knowledge;
    }
  }
}
