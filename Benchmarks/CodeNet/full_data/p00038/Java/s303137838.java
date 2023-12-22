import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      int[] cardNum = new int[14];
      int[] card    = new int[5];
      for(int i = 0; i < 5; i++) {
        card[i] = Integer.parseInt(strArr[i]);
        cardNum[card[i]]++;
      }
      Arrays.sort(card);
      boolean isStraight = true;
      for (int i = 0; i < 4; i++) {
        if (card[i] + 1 != card[i+1]) {
          isStraight = false;
        }
      }
      if (card[0] == 1  && card[1] == 10 && card[2] == 11 &&
          card[3] == 12 && card[4] == 13) {
        isStraight = true;
      }
      int max1 = 0;
      int max2 = 0;
      for(int i = 0; i < 14; i++) {
        if(cardNum[i] > max1) {
          max2 = max1;
          max1 = cardNum[i];
        }
        else if(cardNum[i] > max2) {
          max2 = cardNum[i];
        }
      }
      if (max1 == 4) {
        System.out.println("four card");
      }
      else if (max1 == 3 && max2 == 2) {
        System.out.println("full house");
      }
      else if (isStraight) {
        System.out.println("straight");
      }
      else if (max1 == 3) {
        System.out.println("three card");
      }
      else if (max1 == 2) {
        if (max2 ==2) {
          System.out.println("two pair");
        }
        else {
          System.out.println("one pair");
        }
      }
      else {
        System.out.println("null");
      }
    }
  }
}