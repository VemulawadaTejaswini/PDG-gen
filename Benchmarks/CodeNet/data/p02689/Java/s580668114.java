package main.task166;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.nextInt();
      Set<Integer> set = new HashSet<>();
      int[] h = new int[N];

      for (int i = 0; i < N; i++) {
        h[i] = in.nextInt();
      }

      for (int j = 0; j < M; j++) {
        int a = in.nextInt();
        int b = in.nextInt();

        if(h[a-1]==h[b-1]) {
          set.add(a);
          set.add(b);
        }else {
          set.add(h[a-1] < h[b-1]? a:b);
        }
      }
      out.print(N-set.size());
    }
}
