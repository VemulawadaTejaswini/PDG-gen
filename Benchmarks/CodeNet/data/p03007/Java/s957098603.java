import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    long max = a[n-1]-a[0];
    for(int i=1;i<=n-2;i++)max+=a[i];
    System.out.println(max);
    long min = a[0];
    for(int i=1;i<=n-2;i++){
      System.out.println(min+" "+a[i]);
      min-=a[i];
    }
    System.out.println(a[n-1]+" "+min);
  }
}