import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    int total = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int size = Integer.parseInt(line);
    line = br.readLine();
    String data[] = line.split(" ");
    for (int i = 0; i < size; i ++) {
      int num = Integer.parseInt(data[i]);
      total = total + num;
    }
    int val = size * (size + 1) / 2;
    int val2 = total % val;
    if (val2 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}