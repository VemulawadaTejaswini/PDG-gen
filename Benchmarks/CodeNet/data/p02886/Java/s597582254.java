import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String n_in = scanner.nextLine();
      int n = Integer.parseInt(n_in);

      String d_all = scanner.nextLine();
      String[] d_str = d_all.split(" ");
      int[] d = new int[n];

      for (int i = 0;  i < n  ; i ++ ) {
          d[i] = Integer.parseInt(d_str[i]);
      }

      int r_int = 0;

      for (int i = 0;  i < n - 1 ; i ++ ) {
          for (int j = i+1;  j < n ; j ++ ) {
             r_int = r_int + (d[i] * d[j]);
          }
      }
      System.out.println(r_int);

      return;
    }
  }