import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      final List<Integer> employees = new ArrayList<Integer>();
      final Map<Integer, BigInteger> sales = new HashMap<Integer, BigInteger>();

      for(int i = 0; i < n; i++) {
        final int id = sc.nextInt();
        final long price = sc.nextInt();
        final long num = sc.nextInt();

        final BigInteger total = BigInteger.valueOf(price * num);

        if(sales.containsKey(id)) sales.put(id, sales.get(id).add(total));
        else {
          employees.add(id);
          sales.put(id, total);
        }
      }

      final BigInteger border = BigInteger.valueOf(1000000L);

      boolean na = true;
      for(int id : employees) {
        if(sales.get(id).compareTo(border) >= 0) {
          na = false;
          System.out.println(id);
        }
      }

      if(na) System.out.println("NA");
    }
  }

  private final Scanner sc = new Scanner(System.in);
}