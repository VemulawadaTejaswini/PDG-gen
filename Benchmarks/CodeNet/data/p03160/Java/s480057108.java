import java.util.*;
public class Main{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  int dp[]=new int [n];
  for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
  
  for(int i=1;i<n;i++){
    int min=Integer.MAX_VALUE;
  if((i-1)>=0){
    int a=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
    if(a<min)
      min=a;
  }
    if((i-2)>=0){
     int a=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
      if(a<min)
        min=a;
    }
    dp[i]=min;
  }
  System.out.println(n-1);
}
}