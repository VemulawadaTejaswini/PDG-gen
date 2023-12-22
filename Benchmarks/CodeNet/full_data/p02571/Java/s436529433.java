import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            int ans = t.length() + 1;
            for (int i = 0; i < (s.length() - t.length()) + 1; i++) {
                  int tmp =0;
                  for(int j = 0;j<t.length();j++){
                        if (t.charAt(j) != s.charAt(i+j)){
                              tmp++;
                        }
                  }
                  ans = Math.min(ans,tmp);
            }
            System.out.println(ans);

      }


}
