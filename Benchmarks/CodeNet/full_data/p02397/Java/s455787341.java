import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;
    while ((readStr = reader.readLine()) != null) {
      int[] list = new int[2];
      list[0] = Integer.parseInt(readStr.split(" ")[0]);
      list[1] = Integer.parseInt(readStr.split(" ")[1]);
      
      if (list[0] == 0 && list[1] == 0) break;
      
      ascendingSort(list);

      System.out.println(Arrays.toString(list)
              .replaceAll("\\[|\\]|,", ""));
    }
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

}