import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int m = scanner.nextInt();
    final Num[] a = new Num[m];
    for (int i = 0; i < m; i++) {
      a[i] = Num.of(scanner.nextInt());
    }
    Arrays.sort(a, Comparator.<Num>comparingInt(Num::getValue).reversed());

    int[] positions = new int[n + 1];
    Arrays.fill(positions, -1);
    positions[0] = 0;
    
    for (int count = 2; count <= n; count++) { // match count
      int maxPositions = -1; // maximum amount of position
      for (int j = 0 ; j < m; j++) { // loop less than 10 times
        if (count - a[j].getCount() >= 0
            && positions[count - a[j].getCount()] != -1) {
          // match a[j] can append
          if (positions[count - a[j].getCount()] + 1 > maxPositions) {
            // when a[j] appended, the maximum amount of position updated
            maxPositions = positions[count - a[j].getCount()] + 1;
          }
        }
      }
      positions[count] = maxPositions;
    }

    System.out.println(positions[n]);

    int remainCount = n;
    List<Num> aCandidate = new ArrayList<>(Arrays.asList(a));
    for (int remainPosition = positions[n]; remainPosition > 0; remainPosition--) {
      List<Num> removable = new ArrayList<>();
      for (final Num num : a) {
        if (remainCount - num.getCount() >= 0
            && positions[remainCount - num.getCount()] == positions[remainCount] - 1) {
          System.out.print(num.getValue());
          remainCount -= num.getCount();
          break;
        } else {
          removable.add(num);
        }
      }
      aCandidate.removeAll(removable);
    }

    System.out.println();
  }
}
enum Num {
  M1(1, 2),
  M2(2, 5),
  M3(3, 5),
  M4(4, 4),
  M5(5, 5),
  M6(6, 6),
  M7(7, 3),
  M8(8, 7),
  M9(9, 6),
  ;
  private final int value;
  private final int count;
  Num(final int value, final int count) {
    this.value = value;
    this.count = count;
  }
  public int getValue() {
    return this.value;
  }
  public int getCount() {
    return this.count;
  }
  public static Num of(final int value) {
    for (Num n : values()) {
      if (n.value == value) {
        return n;
      }
    }
    throw new IllegalArgumentException("Num of value = " + value + " is not exist.");
  }
}