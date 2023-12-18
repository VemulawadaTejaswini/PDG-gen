import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int[] P = new int[M];
    int[] Y = new int[M];

    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (int i = 0; i < M; i++) {
      P[i] = Integer.parseInt(sc.next());
      Y[i] = Integer.parseInt(sc.next());
      map.put(Y[i],P[i]);
    }

    sc.close();

    PrintWriter out = new PrintWriter(System.out);

    for (int i = 0; i < M; i++) {
      int j = 1;
      for (Map.Entry<Integer, Integer> m_ : map.entrySet()) {
        if(m_.getKey() == Y[i]){
          break;
        } else {
          if (m_.getValue() == P[i]){
            j++;
          }
        }
      }
      out.println(String.format("%06d", P[i]) + String.format("%06d", j));
    }

    out.flush();

  }

}