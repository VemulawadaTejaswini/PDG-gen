import java.util.Scanner;

class Main{

  static void trace(int[] a, int n){
    int i;
    for(i = 1; i < n; i++)
      System.out.print(a[i] + " ");
    System.out.println(a[i]);
  }

  static void countingSort(int[] a, int[] b, int k){
    int[] c = new int[k+1];
    for(int i = 0; i <= k; i++)
      c[i] = 0;

    for(int i = 1; i < a.length; i++)
      c[a[i]]++;

    for(int i = 1; i <= k; i++)
      c[i] = c[i] + c[i-1];

    for(int i = a.length-1; i >= 1; i--){
      b[c[a[i]]] = a[i];
      c[a[i]]--;
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n+1];
    for(int i = 1; i <= n; i++)
      a[i] = stdIn.nextInt();

    countingSort(a, b, 10000);
    trace(b, n);
  }
}