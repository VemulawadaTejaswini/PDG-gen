import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int q = sc.nextInt();
    long[] s = new long[a];
    long[] t = new long[b];
    long[] x = new long[q];
    for(int i = 0; i < a; i++){
      s[i] = sc.nextLong();
    }
    for(int i = 0; i < b; i++){
      t[i] = sc.nextLong();
    }
    for(int i = 0; i < q; i++){
      x[i] = sc.nextLong();
    }
    for(int i = 0; i < q; i++){
      System.out.println(solve(s, t, x[i]));
    }
  }
  
  public static long solve(long[] a, long[] b, long x){
    long sum1 = 0;
    int i = binarySearch(a, x);
    long now;
    if(i < 0){
      i = ~i;
      int ti;
      long tmp1 = 0;
      tmp1 += Math.abs(x - a[i]);
      now = a[i];
      ti = binarySearch(b, now);
      tmp1 += Math.abs(b[ti] - now);
      
      long tmp2 = 0;
      tmp2 += Math.abs(x - a[i-1]);
      now = a[i-1];
      ti = binarySearch(b, now);
      tmp2 += Math.abs(b[ti] - now);
      sum1 = Math.min(tmp1, tmp2);
    }else{
      sum1 += Math.abs(x - a[i]);
      now = a[i];
      i = binarySearch(b, now);
      sum1 += Math.abs(b[i] - now);
    }
    
    long sum2 = 0;
    i = binarySearch(b, x);
    if(i < 0){
      i = ~i;
      int ti;
      long tmp1 = 0;
      tmp1 += Math.abs(x - b[i]);
      now = b[i];
      ti = binarySearch(a, now);
      tmp1 += Math.abs(a[ti] - now);
      
      long tmp2 = 0;
      tmp2 += Math.abs(x - b[i-1]);
      now = b[i-1];
      ti = binarySearch(a, now);
      tmp2 += Math.abs(a[ti] - now);
      sum2 = Math.min(tmp1, tmp2);
    }else{
      sum2 += Math.abs(x - b[i]);
      now = b[i];
      i = binarySearch(a, now);
      sum2 += Math.abs(a[i] - now);
    }
    
    return Math.min(sum1, sum2);
  }
  
  public static int binarySearch(long[] a, long x){
    int i = Arrays.binarySearch(a, x);
    if(i >= 0){
      return i;
    }else{
      i = ~i;
      if(i == a.length){
        return i - 1;
      }
      if(i == 0){
        return i;
      }
      long tmp = Math.abs(a[i] - x);
      if(tmp == Math.abs(a[i-1] - x)){
        return ~i;
      }else{
        return tmp < Math.abs(a[i-1] - x) ? i : i - 1;
      }
    }
  }
}