import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n;
    n = sc.nextLong();

    ArrayList<Long> arr = new ArrayList<Long>();

    for (int i = 0; i < n; i++) {
      long num = sc.nextLong();
      arr.add(num);
    }

    Collections.sort(arr);
    long max = arr.get(arr.size() - 1);
    long pair = max / 2;
    long diff = Long.MAX_VALUE;
    for (int i = 0; i < arr.size() - 1; i++) {
      long temp = arr.get(i);
      long min = Math.min(Math.abs(pair - temp), Math.abs(pair - max + temp));
      if (diff > min) {
        pair = temp;
        diff = min;
      }
    }
    System.out.println(max + " " + pair);
  }
}
