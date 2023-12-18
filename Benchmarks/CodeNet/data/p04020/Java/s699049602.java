import java.util.Scanner;

public class Main {
  static int n;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int count = 0;
    for(int i = 1; i < n; i++){
      int c = Math.min(a[i - 1], a[i]);
      a[i - 1] -= c; a[i] -= c;
      count += c;
    }

    for(int i = 0; i < n; i++){
      count += a[i] / 2;
    }

    System.out.println(count);
  }
}