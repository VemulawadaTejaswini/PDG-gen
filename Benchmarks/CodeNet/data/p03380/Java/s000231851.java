import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] g = new long[n];
    for (int i=0;i<n;i++){
      g[i] = scan.nextLong();
    }
    Arrays.sort(g);
    long t = (long) (g[n-1]+1)/2;
    int p = search(g,t);

    if ((g[p+1]-t) < (t-g[p])){
      p+=1;
    }
    System.out.print(g[n-1] + " " + g[p]);
  }

  static int search(long[] a, long n){
    long ret = 0;
    int l = 0;
    int r = a.length-1;
    while (l<r){
      int mid = (int) (l+r+1)/2;
      if (a[mid] == n){
        return mid;
      }
      if (a[mid] < n){
        l = mid;
      }
      else{
        r = mid-1;
      }
    }

    return l;
  }

}
