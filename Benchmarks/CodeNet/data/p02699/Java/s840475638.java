import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(final String[] args) throws Exception {
    try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String s = r.readLine();
      String[] a = s.split(" ");
      int sheeps = Integer.parseInt(a[0]);
      int wolves = Integer.parseInt(a[1]);
      if (wolves >= sheeps) {
        System.out.println("unsafe");
      } else {
        System.out.println("safe");
      }
    }
  }
}