import java.util.Scanner;

class Main{
  static int cnt = 0;

  static void insertionSort(int[] a, int n, int g){
    for(int i = g; i < n; i++){
      int w = a[i];
      int j = i;
      while(j - g >= 0 && a[j-g] > w){
        a[j] = a[j-g];
        j -= g;
        cnt++;
      }
      a[j] = w;
    }
  }

  static void shellSort(int[] a, int n){
    int m = 0;
    int h = 1;
    while(h <= n){
      m++;
      h = 3*h + 1;
    }

    System.out.println(m);

    int[] g = new int[m];
    int k = 1;
    for(int i = 0; i < m; i++){
      g[i] = k;
      k = 3*k + 1;
    }
    rtrace(g);
    for(int i = g.length-1; i >= 0; i--)
      insertionSort(a, n, g[i]);
  }

  static void rtrace(int[] a){
    int i;
    for(i = a.length-1; i > 0; i--)
      System.out.print(a[i] + " ");
    System.out.println(a[i]);
  }

  static void trace2(int[] a){
    for(int i = 0; i < a.length; i++)
      System.out.println(a[i]);
  }


  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    shellSort(a, n);
    System.out.println(cnt);
    trace2(a);
  }
}