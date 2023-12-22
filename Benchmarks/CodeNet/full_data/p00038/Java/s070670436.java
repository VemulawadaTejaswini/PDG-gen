import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready()) {
      String[] cardSetStr = input.readLine().split(",");
      System.out.println(getYaku(cardSetStr));
    }
  }

  private static String getYaku(String[] cardSet) {
    ArrayList<Integer> cardSetNum = new ArrayList<>();
    for (int i = 0; i < cardSet.length; i++) {
      cardSetNum.add(Integer.parseInt(cardSet[i]));
    }
    if (isFourCard(cardSetNum)) {
      return "four card";
    }
    if (isFullHouse(cardSetNum)) {
      return "full house";
    }
    if (isStraight(cardSetNum)) {
      return "straight";
    }
    if (isThreeCard(cardSetNum)) {
      return "three card";
    }
    if (isTwoPair(cardSetNum)) {
      return "two pair";
    }
    if (isOnePair(cardSetNum)) {
      return "one pair";
    }
    return "null";
  }

  private static boolean isOnePair(ArrayList<Integer> cardSet) {
    final int[] count = new int[14];
    Arrays.fill(count, 0);
    for (int each : cardSet) {
      count[each]++;
    }
    int pariCount = 0;
    for (int i : count) {
      if (i >= 2) {
        pariCount++;
      }
    }
    return pariCount >= 1;
  }

  private static boolean isTwoPair(ArrayList<Integer> cardSet) {
    final int[] count = new int[14];
    Arrays.fill(count, 0);
    for (int each : cardSet) {
      count[each]++;
    }
    int pariCount = 0;
    for (int i : count) {
      if (i >= 2) {
        pariCount++;
      }
    }
    return pariCount >= 2;
  }

  private static boolean isThreeCard(ArrayList<Integer> cardSet) {
    final int[] count = new int[14];
    Arrays.fill(count, 0);
    for (int each : cardSet) {
      count[each]++;
    }
    int pariCount = 0;
    for (int i : count) {
      if (i >= 3) {
        pariCount++;
      }
    }
    return pariCount >= 1;
  }

  private static boolean isFourCard(ArrayList<Integer> cardSet) {
    final int[] count = new int[14];
    Arrays.fill(count, 0);
    for (int each : cardSet) {
      count[each]++;
    }
    int pariCount = 0;
    for (int i : count) {
      if (i >= 4) {
        pariCount++;
      }
    }
    return pariCount >= 1;
  }

  private static boolean isFullHouse(ArrayList<Integer> cardSet) {
    if (isTwoPair(cardSet) && isThreeCard(cardSet)) {
      return true;
    }
    return false;
  }

  private static boolean isStraight(ArrayList<Integer> cardSet) {
    Collections.sort(cardSet);
    int sumCardNum = 0;
    for (Integer each : cardSet) {
      sumCardNum += each;
    }
    if (sumCardNum - (cardSet.get(0) - 1) * 5 == 15) {
      return true;
    }

    if (cardSet.get(0) == 1 && sumCardNum == 47) {
      return true;
    }
    return false;
  }
}