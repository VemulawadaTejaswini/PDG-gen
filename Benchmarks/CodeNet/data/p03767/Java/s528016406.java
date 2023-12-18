import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    long sum = 0;
    int answer = 0;
    ArrayList<Long> aList = new ArrayList<Long>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    int nn = Integer.parseInt(line);
    line = br.readLine();
    String data[] = line.split(" ");
    for (int i = 0; i < data.length; i ++) {
      long num = Long.parseLong(data[i]);
      aList.add(num);
    }
    Collections.sort(aList);
    for (int i = nn; i < 2 * nn; i++) {
      long num = aList.get(i);
      sum = sum + num;
    }
    System.out.println(sum);
  }
}
