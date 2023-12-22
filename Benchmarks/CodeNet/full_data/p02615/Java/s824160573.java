import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    int count = 0;
    long ans = 0;
    
    ans += (long)a[n-1];
    count++;
    
    for(int i=n-2;i>=0;i--){
      ans += (long) a[i];
      count++;
      if( count >= n -1 ){
        break;
      }
      ans +=(long) a[i];
      count++;
      if( count >= n -1 ){
        break;
      }
    }
    if( n == 1 ){
      ans = 0l;
    }
    //ans +=(long)  1000000000 * 2 * 100000;
    System.out.println(ans);
  }
}