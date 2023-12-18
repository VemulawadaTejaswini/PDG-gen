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
    for(int i = 0; i < n; i++){
      int tmp = a[i] / 2;
      count += tmp;
      a[i] -= 2 * tmp;
    }

    for(int i = 1; i < n; i++){
      if(a[i - 1] == 1 && a[i] == 1){
        a[i - 1] = a[i] = 0;
        ++count;
      }
    }

    System.out.println(count);
  }
}