import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      List<Integer> A = new ArrayList<Integer>();
      List<Integer> B = new ArrayList<Integer>();
      List<Integer> C = new ArrayList<Integer>();

      int ans = 0;

      for(int cnt = 0; cnt < N; cnt++) {
          A.add(in.nextInt());
      }
      for(int cnt = 0; cnt < N; cnt++) {
          B.add(in.nextInt());
      }
      for(int cnt = 0; cnt < N; cnt++) {
          C.add(in.nextInt());
      }

      Collections.sort(A);
      Collections.reverse(A);
      Collections.sort(A);
      Collections.reverse(A);
      Collections.sort(A);
      Collections.reverse(A);

      for (int i = 0; i < A.size(); i++) {
          int a = A.get(i);
           for(int j = 0; j < B.size(); j++) {
               int b = B.get(j);
               if(a >= b) {
                   continue;
               }
               for(int k = 0; k < C.size(); k++) {
                   int c = C.get(k);
                   if(b >= c) {
                       continue;
                   }
                       ans++;


                   }
               }
           }
    System.out.println(ans);
    }
}
