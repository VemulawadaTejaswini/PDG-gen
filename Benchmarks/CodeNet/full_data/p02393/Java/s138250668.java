import java.util.*;

public class Main {
  public static void main(String[] args) {
    // ???????????????
    List<Integer> targetList = new ArrayList<Integer>();

    // ??????????????????
    createNumsList(targetList);
    int sizeOfList = targetList.size();

    // ?°????????????????????????????
    bubbleSort(targetList, sizeOfList);
    // ???????????????
    printResult(targetList, sizeOfList);
  }

  private static void createNumsList(List<Integer> targetList) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      // ????????????
      targetList.add(sc.nextInt());
    }
  }

  private static void bubbleSort(List<Integer> targetList, int sizeOfList) {
    for (int i = 0; i < sizeOfList-1; i++) {
      for (int j = i+1; j < sizeOfList; j++) {
        if (targetList.get(i) > targetList.get(j)) {
          swap(targetList, i, j);
        }
      }
    }
  }

  private static void swap(List<Integer> targetList, int x, int y) {
    int temp = targetList.get(x);
    targetList.set(x, targetList.get(y));
    targetList.set(y, temp);
  }

  private static void printResult(List<Integer> targetList, int sizeOfList) {
    for (int i = 0; i < sizeOfList; i++) {
      System.out.print(targetList.get(i));
      if (i != sizeOfList-1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}