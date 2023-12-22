import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int maxv = -1000000000;
    a[0] = sc.nextInt();
    int minv = a[0];
    for(int i = 1; i<n; i++){
      a[i] = sc.nextInt();
      maxv = Math.max(maxv, a[i]-minv);
      minv = Math.min(minv,a[i]);
    }
    System.out.println(maxv);
  }
}