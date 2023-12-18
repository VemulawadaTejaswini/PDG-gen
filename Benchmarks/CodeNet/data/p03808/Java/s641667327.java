import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    int total = 0;
    int diff = 0;
    int count = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int size = Integer.parseInt(line);
    line = br.readLine();
    String data[] = line.split(" ");
    int[] array = new int[size];
    for (int i = 0; i < size; i ++) {
      int num = Integer.parseInt(data[i]);
      total = total + num;
      array[i] = num;
    }
    int val1 = size * (size + 1) / 2;
    int val2 = total % val1;
    if (val2 != 0) {
      System.out.println("NO");
      return;
    }
    int kk = total / val1;
    for (int i = 0; i < size; i++) {
      if (i == (size - 1)) {
        diff = array[0] - array[i];
      } else {
        diff = array[i + 1] - array[i];
      }
      if (diff < kk) {
        int k = (kk - diff)%size;
        if (k != 0) {
          System.out.println("NO");
          return;
        }
        count = count + (kk - diff)/size;
      }
    }
    System.out.println("YES");
  }
}