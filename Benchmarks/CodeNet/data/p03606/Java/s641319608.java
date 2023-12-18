import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int size = Integer.parseInt(line);
    long res = 0;
    for (int i = 0; i < size; i ++) {
      line = br.readLine();
      String data[] = line.split(" ");
      long start = Long.parseLong(data[0]);
      long end = Long.parseLong(data[1]);
      res = res + (end - start) + 1;
    }
    System.out.println(res);
  }
}