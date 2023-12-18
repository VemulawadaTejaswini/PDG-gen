import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    int len = (n * (n - 1) / 2);
    long[] aa = new long[len];
    int j = 0;
    for(int i = 0;i < n;i++){
      a[i] = sc.nextLong();
    }
    for(int x = 0;x < n - 1;x++){
      for(int y = x + 1;y < n;y++){
        aa[j] = a[x] * a[y];
        j++;
      }
    }
    Arrays.sort(aa);
 //   System.out.println(Arrays.toString(aa));
    System.out.println(aa[k - 1]);
  }
}
