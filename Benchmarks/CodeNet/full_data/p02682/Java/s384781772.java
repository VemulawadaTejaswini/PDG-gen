import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      int oneNum = stdIn.nextInt();
      if (oneNum < 0) return;
      int zeroNum = stdIn.nextInt();
      if (zeroNum < 0) return;
      int minusOneNum = stdIn.nextInt();
      if (minusOneNum < 0) return;
      int selectNum = stdIn.nextInt();
      if (selectNum < 1 || (oneNum + zeroNum + minusOneNum) < selectNum || (oneNum + zeroNum + minusOneNum) > 2 * Math.pow(10, 9)) return;
      int maxValue = 0;
      int restSelect = selectNum;
      if (restSelect != 0) {
        if (oneNum <= restSelect) {
          for (int oneCnt = 0; oneCnt < oneNum; oneCnt++) {
            maxValue++;
          }
          restSelect -= oneNum;
        } else {
          for (int oneCnt = 0; oneCnt < restSelect; oneCnt++) {
            maxValue++;
          }
          restSelect = 0;
        }
      }
      if (restSelect != 0) {
        if (zeroNum <= restSelect) {
          restSelect -= zeroNum;
        } else {
          restSelect -= restSelect;
        }
      }
      if (restSelect != 0) {
        if (minusOneNum <= restSelect) {
          for (int minusOneCnt = 0; minusOneCnt < minusOneNum; minusOneCnt++) {
            maxValue--;
          }
          restSelect -= minusOneNum;
        } else {
          for (int minusOneCnt = 0; minusOneCnt < restSelect; minusOneCnt++) {
            maxValue--;
          }
          restSelect -= restSelect;
        }
      }
      System.out.println(maxValue);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}