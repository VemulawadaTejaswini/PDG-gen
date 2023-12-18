import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    int[] arr = new int[length];
    fillArray(arr,scan);
    int dp[] = new int[length];
    dp[0]=0;
    dp[1]=Math.abs(arr[1]-arr[0]);
    for(int i=2; i<dp.length; i++) {
      dp[i]=Math.min(dp[i-1]+Math.abs( (arr[i]-arr[i-1]) ),dp[i-2]+Math.abs( (arr[i]-arr[i-2]) ));
    }
    System.out.println(dp[length-1]);
    scan.close();
  }
  
  public static void fillArray(int[] arr,Scanner scan) {
    for(int i=0; i<arr.length; i++) {
      arr[i]=scan.nextInt();
    }
  }
}