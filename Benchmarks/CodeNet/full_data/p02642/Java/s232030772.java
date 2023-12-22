import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // printTestValue();
    d();
  }

  public static void dTest() {
    long startTime = System.currentTimeMillis();
    d();
    long endTime = System.currentTimeMillis();
    System.out.println("処理時間：" + (endTime - startTime) + " ms");
  }

  public static void d() {

    try (Scanner sc = new Scanner(System.in)) {

      int listSize = Integer.parseInt(sc.next());
      Integer[] inputList = new Integer[listSize];
      for (int x = 0; x < listSize; x++) {
        inputList[x] = Integer.parseInt(sc.next());
      }
      Arrays.parallelSort(inputList);
      int[] resultList = new int[1000010];

      for (int checkNum : inputList) {
        if (resultList[checkNum] != 0) {
          resultList[checkNum]++;
          continue;
        }
        for (int targetMultiply = checkNum; targetMultiply < resultList.length;
          targetMultiply += checkNum) {
          resultList[targetMultiply]++;
        }
      }
      int ans = 0;
      for (int input : inputList) {
        if (resultList[input] == 1) ans++;
      }

      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
  //
  // void tempCode() {
  // try (Scanner sc = new Scanner(System.in)) {
  // int a = Integer.parseInt(sc.next());
  // String b = sc.next();
  // }
  // }

  public static void printTestValue() {
    int valueA = (int) (2 * Math.pow(10d, 5d));
    int valueB = (int) Math.pow(10d, 6d);
    System.out.println(valueA);
    for (int x = 0; x < valueA; x++) {
      System.out.println(
        Math.round(Math.random() * Math.random() * Math.random() * valueB
          + Math.random() * 100));
    }
  }
}
