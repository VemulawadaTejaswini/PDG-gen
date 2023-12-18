import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long total = 0;
    long diff = 0;
    long count = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int size = Integer.parseInt(line);
    line = br.readLine();
    String data[] = line.split(" ");
    long[] array = new long[size];
    for (int i = 0; i < size; i ++) {
      long num = Long.parseLong(data[i]);
      total = total + num;
      array[i] = num;
    }
    long val1 = size * (size + 1) / 2;
    long val2 = total % val1;
    if (val2 != 0) {
      System.out.println("NO");
      return;
    }
    long kk = total / val1;
    for (int i = 0; i < size; i++) {
      if (i == (size - 1)) {
        diff = array[0] - array[i];
      } else {
        diff = array[i + 1] - array[i];
      }
      if (diff < kk) {
        long k = (kk - diff)%size;
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