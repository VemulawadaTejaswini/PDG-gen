import java.util.*;


public class Main{

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextLong() - (i+1);
    }
    Arrays.sort(arr);
    long b, ans1 = 0, ans2 = 0;
    if (n % 2 == 1){
      b = arr[n/2];
      for(int i=0;i<n;i++){
        ans1 += Math.abs(arr[i]-b);
      }
      System.out.println(ans1);
    }else{
      b = arr[n/2-1];
      for(int i=0;i<n;i++){
        ans1 += Math.abs(arr[i]-b);
      }
      b = arr[n/2];
      for(int i=0;i<n;i++){
        ans2 += Math.abs(arr[i]-b);
      }
      System.out.println(Math.min(ans1, ans2));
    }
  }
}