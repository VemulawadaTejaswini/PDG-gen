import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 1; i = 0) {
          String line = sc.nextLine();
          String[] l = line.split("");

          int len = l.length;
          int ans = 0;
          for(int j = 0; j < len; j++) {
            ans += Integer.parseInt(l[j]);
          }

          if(ans == 0) {
            break;
          }

          System.out.println(ans);
        }
    }
}