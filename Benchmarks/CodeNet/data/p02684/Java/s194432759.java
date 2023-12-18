import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[k+1];
    for (int i=0; i<n; i++) {
      a[i] = sc.nextInt();
    }
    b[0] = a[0];
    for (int j=1; j<k+1; j++) {
      b[j] = a[b[j-1]-1];       
    }
    System.out.println(b[k-1]);
  }
}