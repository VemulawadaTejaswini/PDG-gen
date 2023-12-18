import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a;
      int[] d = new int[n];
      String out = "";

      for (int i = 0;  i < n  ; i ++ ) {
          a = scanner.nextInt();
          d[a - 1] = i + 1;
      }

      out = Integer.toString(d[0]);
      
      for (int i = 1;  i < n ; i ++ ) {
         out = out + " " + Integer.toString(d[i]);
      }

      System.out.println(out);

      return;
    }
  }