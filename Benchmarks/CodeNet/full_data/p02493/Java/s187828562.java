import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int [] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 1; i < n; i++) {
      System.out.print(" "+a[n-i-1]);
    }
    System.out.print(a[0]);
  }
}