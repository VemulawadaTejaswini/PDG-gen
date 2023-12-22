import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] listStr = reader.readLine().split(" ");
    int[] list = new int[listStr.length];
    int[] copyList = new int[listStr.length];
    boolean flag = true;

    for (int i = 0; i < listStr.length; i++) {
      list[i] = Integer.parseInt(listStr[i]);
    }
    System.arraycopy(list, 0, copyList, 0, list.length);

    ascendingSort(list);

    for (int i = 0; i < list.length; i++) {
      if (i < list.length - 2 && list[i] == copyList[i + 1]) {
        flag = false;
        break;
      }
      if (list[i] != copyList[i]) {
        flag = false;
        break;
      }
    }

    System.out.println(flag ? "Yes" : "No");

  }

  public static void ascendingSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }
      }
    }
  }

  public static void descendingSort(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      for (int j = array.length - 1; j > array.length - 1 - i; j--) {
        if (array[j] > array[j - 1]) {
          int tmp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = tmp;
        }
      }
    }
  }

}