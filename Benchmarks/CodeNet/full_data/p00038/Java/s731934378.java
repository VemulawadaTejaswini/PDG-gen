import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
    if (isThreeCard(cardSetNum)) {
      return "three card";
    }
    if (isTwoPair(cardSetNum)) {
      return "two pari";
    }
    if (isOnePair(cardSetNum)) {
      return "one pari";
    }
    if (isStraight(cardSetNum)) {
      return "straight";
    }
    return "null";
  }

  private static boolean isOnePair(ArrayList<Integer> cardSet) {
    for (int i = 0; i < cardSet.size(); i++) {
      for (int j = i + 1; j < cardSet.size(); j++) {
        if (cardSet.get(i) == cardSet.get(j)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean isTwoPair(ArrayList<Integer> cardSet) {
    int pariCount = 0;
    int pariedCardNum = 0;
    for (int i = 0; i < cardSet.size(); i++) {
      if (pariedCardNum == cardSet.get(i)) {
        continue;
      }
      for (int j = i + 1; j < cardSet.size(); j++) {
        if (cardSet.get(i) == cardSet.get(j)) {
          pariedCardNum = cardSet.get(i);
          pariCount++;
          break;
        }
      }
    }
    return pariCount == 2;
  }

  private static boolean isThreeCard(ArrayList<Integer> cardSet) {
    int pariCount = 0;
    for (int i = 0; i < cardSet.size(); i++) {
      for (int j = i + 1; j < cardSet.size(); j++) {
        if (cardSet.get(i) == cardSet.get(j)) {
          pariCount++;
        }
      }
    }
    return pariCount == 3;
  }

  private static boolean isFourCard(ArrayList<Integer> cardSet) {
    int pariCount = 0;
    for (int i = 0; i < cardSet.size(); i++) {
      for (int j = i + 1; j < cardSet.size(); j++) {
        if (cardSet.get(i) == cardSet.get(j)) {
          pariCount++;
        }
      }
    }
    return pariCount == 4;
  }

  private static boolean isFullHouse(ArrayList<Integer> cardSet) {
    if (isTwoPair(cardSet) && isThreeCard(cardSet)) {
      return true;
    }
    return false;
  }

  private static boolean isStraight(ArrayList<Integer> cardSet) {
    Collections.sort(cardSet);
    int currentCard = cardSet.get(0);
    int chainCount = 0;
    for (int i = 1; i < 5; i++) {
      if (getAfterCard(currentCard) != cardSet.get(i)) {
        break;
      }
      currentCard = cardSet.get(i);
      chainCount++;
    }
    currentCard = cardSet.get(0);
    for (int i = 4; i > 0; i--) {
      if (getBeforCard(currentCard) != cardSet.get(i)) {
        break;
      }
      currentCard = cardSet.get(i);
      chainCount++;
    }
    return chainCount == 4;
  }

  private static int getBeforCard(int cardNum) {
    if (cardNum == 1) {
      return 13;
    }
    final int ret = cardNum - 1;
    return ret;
  }

  private static int getAfterCard(int cardNum) {
    if (cardNum == 13) {
      return 1;
    }
    final int ret = cardNum + 1;
    return ret;
  }

}