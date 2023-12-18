package main.atcoder;

import fastIO.InputReader;

import java.io.PrintWriter;

public class APoisonousCookies {
  public void solve(int testNumber, InputReader in, PrintWriter out) {
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    long d = c - a > 0 ? c - a : 0;
    long f = d - b > 0 ? d - b : 0;
    long res= Math.min(a,c) + Math.min(d,b) + Math.min(f,1) + b;
    out.println(res);
  }
}
