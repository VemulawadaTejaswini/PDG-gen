package ABC121.C;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(final String[] ars) {
    final Scanner scanner = new Scanner(System.in);
    final int N = Integer.parseInt(scanner.next());
    final int M = Integer.parseInt(scanner.next());
    final List<Shop> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(new Shop(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next())));
    }
    list.sort(Comparator.comparingInt(e -> e.price));

    int price = 0;
    int count = 0;
    for (final Shop shop : list) {
      if (count + shop.count >= M) {
        price += (M - count) * shop.price;
        break;
      }
      count += shop.count;
      price += shop.count * shop.price;
    }
    System.out.println(price);
  }
}


class Shop {
  int price;
  int count;

  public Shop(final int price, final int count) {
    this.price = price;
    this.count = count;
  }
}