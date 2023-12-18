import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  long N = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();
  for (int i = 1; i < N; i++) {
    long c = sc.nextLong();
    long d = sc.nextLong();
    long p = Math.max(a / c, b / d);
    while (c * p < a || d * p < b)
      p++;
    a = c * p;
    b = d * p;
  }
  System.out.println(a+b);
}}