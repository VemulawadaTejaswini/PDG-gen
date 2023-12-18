import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    try {
      int attendanceNum = stdIn.nextInt();
      if (attendanceNum < 2 || attendanceNum > (2 * Math.pow(10, 5))) return;
      int[] attendanceInfo = new int[attendanceNum];
      for (int cnt = 0; cnt < attendanceNum; cnt++) {
        int hight = stdIn.nextInt();
        if (hight < 1 || hight > Math.pow(10, 9)) return;
        attendanceInfo[cnt] = hight;
      }
      int pairNum = 0;
      for (int targetCnt = 0; targetCnt < attendanceInfo.length; targetCnt++) {
        for (int compareCnt = 0; compareCnt < attendanceInfo.length; compareCnt++) {
          int indexDiff = 0;
          int hightSum = 0;
          if (targetCnt != compareCnt) {
            indexDiff = Math.abs((targetCnt + 1) - (compareCnt + 1));
            hightSum = attendanceInfo[targetCnt] + attendanceInfo[compareCnt];
            if (indexDiff == hightSum) {
              pairNum++;
            }
          }
        }
      }
      System.out.println(pairNum / 2);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      stdIn.close();
    }
  }
}