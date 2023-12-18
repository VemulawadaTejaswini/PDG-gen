import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  int y = scan.nextInt();
  long frac[] = new long[100020];
  int a = 1000000007;
  if (Math.abs(x - y) > 1) {
    System.out.println('0');
    return;
  }
  frac[0] = 1;
  for (int i = 1; i <= 100000; i++)frac[i] = frac[i - 1] * i % a;
  long ans = frac[x] * frac[y] % a;
  if (x == y) ans = ans * 2 % a;
  System.out.println(ans);
  return;
}}