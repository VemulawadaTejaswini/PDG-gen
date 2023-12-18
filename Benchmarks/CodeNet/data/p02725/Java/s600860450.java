import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    long ans = 0;
    if(a[0] != 0 && a[n-1] != k) {
    ans = a[n-1] - a[0];
    }
    else if(a[n-1] == k && a[0] != 0){
    	ans = a[n-2] - a[0];
    }
    else {
    	ans = a[n-1] - a[1];
    }
    System.out.println(ans);
  }
}