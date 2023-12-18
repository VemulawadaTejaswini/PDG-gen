import java.util.*;

/**
 * Energy Drink Collector
 */
public class Main {
  private static final String DELIMITER = " ";

  private static class Key implements Comparable<Key> {
    private Integer index;
    private Integer price;
    public Key(Integer index, Integer price) {
      this.index = index;
      this.price = price;
    }

    @Override
    public int compareTo(Key anotherKey) {
      return this.price.compareTo(anotherKey.price);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] firstLineArray = scanner.nextLine().split(DELIMITER);
    // 店の件数
    Integer n = Integer.valueOf(firstLineArray[0]);
    // 買い集める栄養ドリンクの本数
    Integer m = Integer.valueOf(firstLineArray[1]);
    Map<Key, Integer> map = new TreeMap<>();
    int index = 0;
    while (scanner.hasNext()) {
      String[] rowArray = scanner.nextLine().split(DELIMITER);
      Integer price = Integer.valueOf(rowArray[0]);
      Integer num = Integer.valueOf(rowArray[1]);
      Key key = new Key(index, price);
      map.put(key, num);
      index++;
    }

    Integer totalNum = 0;
    Long totalCost = 0L;

    for (Key key : map.keySet()) {
      Integer numOfDrink = map.get(key);
      for (int j = 0; j < numOfDrink; j ++) {
        if (totalNum < m) {
          totalCost += key.price;
          totalNum++;
        } else {
          break;
        }
      }
    }

    System.out.println(totalCost);
  }
}
