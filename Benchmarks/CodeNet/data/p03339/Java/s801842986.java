import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String str = sc.next();
    int min_count = N;
    int count;

    String str1 = str.substring(1);
    count = str1.length() - str1.replaceAll("E", "").length();
    min_count = Math.min(min_count, count);

    for (int i=1; i < N; i++) {
      if (str.substring(i-1, i).equals("W") && str.substring(i, i+1).equals("W")) {
        count++;
      }

      if (str.substring(i-1, i).equals("EE") && str.substring(i, i+1).equals("EE")) {
        count--;
      }

      min_count = Math.min(min_count, count);
    }

    System.out.println(min_count);
  }
}
