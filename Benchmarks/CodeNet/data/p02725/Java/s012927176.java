import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int sum1=arr[0];
    for(int i=1;i<n;i++){
      sum1 = sum1+arr[i]-arr[i-1];
    }
    int sum2 = (k-arr[arr.length-1])+arr[0];
    for(int i=1;i<n-1;i++){
      sum2 = sum2+arr[i]-arr[i-1];
    }
    System.out.println(Math.min(sum1,sum2));
  }
}