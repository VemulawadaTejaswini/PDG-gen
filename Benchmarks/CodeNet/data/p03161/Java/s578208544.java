import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String firstLine = scanner.nextLine();
    String[] firstArgs = firstLine.split(" ");
    int N = Integer.parseInt(firstArgs[0]);
    int K = Integer.parseInt(firstArgs[1]);

    String secondLine = scanner.nextLine();
    String[] secondArgs = secondLine.split(" ");
    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = Integer.parseInt(secondArgs[i]);
    }

    int[] minCumulativeCosts = new int[N];
    for (int i = 0; i < N; i++) {
      if (i == 0) {
        minCumulativeCosts[i] = 0;
        continue;
      }

      int minCost = Integer.MAX_VALUE;
      for (int j = Math.max(i - K, 0); j < i; j++) {
        int costBetweenNodes = Math.abs(H[i] - H[j]);
        int cumulativeCost = minCumulativeCosts[j];
        int totalCost = costBetweenNodes + cumulativeCost;
        minCost = Math.min(minCost, totalCost);
      }
      minCumulativeCosts[i] = minCost;
    }

    System.out.println(minCumulativeCosts[N - 1]);
  }
}
