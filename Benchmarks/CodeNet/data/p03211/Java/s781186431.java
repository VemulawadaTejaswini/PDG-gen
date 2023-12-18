import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = 753;
    int min = 10000;

    for (int i = 0; i < s.length()-2; i++) {
      String k = s.substring(i,i+3);
      int d = Integer.parseInt(k);
      int x = Math.abs(d-n);
      min = Math.min(min,x);
    }

    System.out.println(min);

  }

}
