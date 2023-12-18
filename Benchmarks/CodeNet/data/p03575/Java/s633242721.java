import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int M = in.nextInt();

      // 隣接リストを作りたい人生だった（完）
      LinkedList<Integer> S = new LinkedList<Integer>();

      for(int cnt = 0;cnt < 10000; cnt++) {
          S.add(cnt, null);
      }


      for(int cnt = 0;cnt < M; cnt++) {
          int a = in.nextInt();
          int b = in.nextInt();

          S.add(b,a);
          S.add(a,b);
      }

      System.out.println(Arrays.toString(S.toArray()));

    }
}