import java.util.Scanner;
import java.util.PriorityQueue;

public class PowerfulDiscountTicket {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong(); // Items
    long M = scanner.nextLong(); // Discount tickets

    PriorityQueue<Long> queue = new PriorityQueue<>();
    while (scanner.hasNextInt()) {
      long price = scanner.nextInt();
      // Use the negative version because PriorityQueue is a min heap!
      queue.add(-price);
    }

    while (M-- > 0) {
      long negativePrice = queue.poll();
      queue.add(negativePrice / 2);
    }

    long totalPrice = 0;
    for (long negativePrice : queue) {
      long price = -negativePrice;
      totalPrice += price;
    }

    System.out.println(totalPrice);
  }
}
