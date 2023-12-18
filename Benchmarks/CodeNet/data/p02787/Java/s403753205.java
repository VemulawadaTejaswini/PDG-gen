import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  private static class Magic {

    int attackPoint;
    int cost;

    Magic(int attackPoint, int cost) {
      this.attackPoint = attackPoint;
      this.cost = cost;
    }
  }

  private static int minCost;
  private static List<Magic> magicsInAscendingOrderOfCost = new ArrayList<>();

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int hitPoint = scanner.nextInt();
    final int numberOfMagic = scanner.nextInt();
    final List<Magic> magics = new ArrayList<>();

    minCost = Integer.MAX_VALUE;
    for (int i = 0; i < numberOfMagic; i++) {
      Magic magic = new Magic(scanner.nextInt(), scanner.nextInt());
      magics.add(magic);

      if (minCost > magic.cost) {
        minCost = magic.cost;
      }
    }
    magicsInAscendingOrderOfCost = magics.stream()
        .sorted(Comparator.comparingInt(magic -> magic.cost))
        .collect(Collectors.toList());

    System.out.println(getCost(hitPoint));
  }

  private static long getCost(int hitPoint) {
    final int attackPointOfMinCost = magicsInAscendingOrderOfCost.get(0).attackPoint;
    if (hitPoint <= attackPointOfMinCost) {
      return minCost;
    }

    long[] minCosts = new long[hitPoint + 1];
    for (int i = 0; i <= attackPointOfMinCost; i++) {
      minCosts[i] = minCost;
    }

    for (int currentHitPoint = attackPointOfMinCost + 1; currentHitPoint <= hitPoint;
        currentHitPoint++) {

      long minCostCandidate = Long.MAX_VALUE;
      for (Magic magic : magicsInAscendingOrderOfCost) {
        int remainingHitPoint = currentHitPoint - magic.attackPoint;

        long candidate =
            remainingHitPoint > 0 ? minCosts[remainingHitPoint] + magic.cost : magic.cost;

        if (candidate < minCostCandidate) {
          minCostCandidate = candidate;
        }
      }

      minCosts[currentHitPoint] = minCostCandidate;
    }

    return minCosts[hitPoint];
  }
}