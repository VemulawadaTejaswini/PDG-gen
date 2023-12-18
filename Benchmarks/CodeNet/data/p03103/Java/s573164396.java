import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      Shop[] shop = new Shop[N];

      for (int i = 0; i < shop.length; ++i) {
        shop[i] = new Shop(in.nextInt(), in.nextInt());
      }
      
      Arrays.sort(shop);

      long cost = 0;
      for (int i = 0; M > 0; ++i) {
        cost += (long)shop[i].price * Math.min(M, shop[i].numOfDrink);
        M -= shop[i].numOfDrink;
      }

      System.out.println(cost);
    }
  }

  private static class Shop implements Comparable<Shop>{
    int price;
    int numOfDrink;
    
    Shop (int price, int numOfDrink) {
      this.price = price;
      this.numOfDrink = numOfDrink;
    }

    @Override
    public int compareTo(Shop s) {
      return this.price - s.price;
    }
  }
}