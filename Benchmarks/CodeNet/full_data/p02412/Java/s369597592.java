import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 1; i = 0) {
          String line = sc.nextLine();
          String[] l = line.split(" ");
          int n = Integer.parseInt(l[0]);
          int x = Integer.parseInt(l[1]);

          if(n == 0 && x == 0) {
            break;
          }

          int count = 0;
          for(int a = 1; a <= n - 2; a++) {
            for(int b = a + 1; b <= n - 1; b++) {
              for(int c = b + 1; c <= n; c++) {
                if(a + b + c == x) {
                  count++;
                }
              }
            }
          }

          System.out.println(count);
        }
    }
}