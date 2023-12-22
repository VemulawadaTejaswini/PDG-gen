import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      int observatoryNum = stdIn.nextInt();
      if (observatoryNum < 2 || observatoryNum > (int)Math.pow(10, 5)) return;
      int[][] roadList = new int[observatoryNum][observatoryNum];
      int roadNum = stdIn.nextInt();
      if (roadNum < 1 || roadNum > Math.pow(10, 5)) return;
      int[] hight = new int[observatoryNum];
      for (int hightCnt = 0; hightCnt < observatoryNum; hightCnt++) {
        hight[hightCnt] = stdIn.nextInt();
        if (hight[hightCnt] < 1 || hight[hightCnt] > Math.pow(10, 9)) return;
      }
      for (int roadCnt = 0; roadCnt < roadNum; roadCnt++) {
        int startPosition = stdIn.nextInt() - 1;
        int endPosition = stdIn.nextInt() - 1;
        if (startPosition == endPosition) return;
        roadList[startPosition][endPosition] = 1;
        roadList[endPosition][startPosition] = 1;
      }
      int highestNum = 0;
      for (int sourceCnt = 0; sourceCnt < observatoryNum; sourceCnt++) {
        int compareResult = 0;
        int compareTarget = 0;
        for (int targetCnt = 0; targetCnt < observatoryNum; targetCnt++) {
          if (roadList[sourceCnt][targetCnt] == 1) {
            compareTarget++;
            if (hight[sourceCnt] > hight[targetCnt]) {
              compareResult++;
            }
          }
        }
        highestNum += compareResult == compareTarget ? 1 : 0;
      }
      System.out.println(highestNum);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}