import java.util.Scanner;

public class Main {
  public static int Q;
  public static int[] a;
  public static int[] b;
  public static int[] c;
  public static int[] d;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    Q = scan.nextInt();
    a = new int[Q];
    b = new int[Q];
    c = new int[Q];
    d = new int[Q];
    for(int i=0; i<Q; i++) {
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
      c[i] = scan.nextInt();
      d[i] = scan.nextInt();
    }
    scan.close();

    System.out.println(rec(0, N, M, new int[N]));
  }

  public static int rec(int now, int size, int M, int[] array) {
    if(now == size) {
      int sum = 0;
      for(int i=0; i<Q; i++) {
        if(array[b[i]-1] - array[a[i]-1] == c[i]) {
          sum += d[i];
        }
      }
      return sum;
    }

    int start;
    if(now == 0) {
      start = 1;
    }
    else {
      start = array[now-1];
    }
    int max = 0;
    for(int i=start; i<=M; i++) {
      array[now] = i;
      int sum = rec(now+1, size, M, array);
      if(max < sum) {
        max = sum;
      }
    }

    return max;
  }
}