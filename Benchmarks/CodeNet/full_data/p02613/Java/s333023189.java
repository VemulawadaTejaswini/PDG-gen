import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] c = new String[n];
    String[] results = { "AC", "WA", "TLE", "RE" };
    int[] resultCnt = { 0, 0, 0, 0 };
    for (int cnt = 0; cnt < n; cnt++) {
      c[cnt] = sc.next();
      switch (c[cnt]) {
        case "AC":
          resultCnt[0] += 1;
          break;
        case "WA":
          resultCnt[1] += 1;
          break;
        case "TLE":
          resultCnt[2] += 1;
          break;
        case "RE":
          resultCnt[3] += 1;
          break;
      }
    }
    for (int cnt = 0; cnt < 4; cnt++) {
      System.out.println(results[cnt] + " x " + resultCnt[cnt]);
    }
    sc.close();
  }
}