package main.atcoder;

import fastIO.InputReader;

import java.io.PrintWriter;

public class ABulletinBoard {
  public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int h = in.nextInt();
    int w = in.nextInt();
    int count = 0;
    for (int i = 0; i <= n - h; i++) {
      for (int j = 0; j <= n - w; j++) {
        count++;
      }
    }
    out.println(count);
  }
}
