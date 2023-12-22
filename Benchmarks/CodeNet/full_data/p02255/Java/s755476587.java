import java.util.Scanner;

class Main{
  static void output(int[] a){
    int i;
    for(i = 0; i < a.length - 1; i++)
      System.out.print(a[i] + " ");
    System.out.println(a[i]);
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    for(int i = 0; i < n; i++){
      int w = a[i];
      int j = i;
      while(j > 0 && a[j - 1] > w){
        a[j] = a[j - 1];
        j--;
      }
      a[j] = w;
      output(a);
    }

  }
}