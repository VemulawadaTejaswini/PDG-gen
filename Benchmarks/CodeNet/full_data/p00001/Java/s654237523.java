import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    int[] m = new int[10];
    input(m, 10);
    Arrays.sort(m);
    reverse(m);
    output(m, 3);
  }

  private static final void reverse(int[] m){
    int n = m.length;
    for (int i = 0; i < n / 2; i++){
      int tmp = m[i];
      m[i] = m[n - i - 1];
      m[n - i - 1] = tmp;
    }
  }

  private static final void output(int[] m, int n){
    for (int i = 0; i < n; i++){
      System.out.println(m[i]);
    }
  }

  private static final void input(int[] m, int n){
    Scanner cin = new Scanner(System.in);
    for (int i = 0; i < n; i++){
      m[i] = cin.nextInt();
    }
  }
}