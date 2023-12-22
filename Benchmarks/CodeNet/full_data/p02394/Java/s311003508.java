import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws IOException {
    int w, h, x, y, r;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    List<Integer> list = new ArrayList<Integer>();
    for (String f : input) {
      list.add(Integer.parseInt(f));
    }
    w = list.get(0);
    h = list.get(1);
    x = list.get(2);
    y = list.get(3);
    r = list.get(4);
    if (x <= 0 || y <= 0) {
      System.out.println("No");
    }
    else if (0 <= (x + r) && (x + r) <= w && 0 <= (y + r) && (y + r) <= h) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}