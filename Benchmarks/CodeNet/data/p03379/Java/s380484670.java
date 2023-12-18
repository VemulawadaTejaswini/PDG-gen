import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int [n];
    for(int i = 0;i < n;i++){
      x[i] = sc.nextInt();
    }

    int a[] = new int [n];
    for(int i = 0;i < n;i++){
      a = x.clone();
      a[i] = -1;
      Arrays.sort(a);
      System.out.println(a[n/2]);
    }
  }
}