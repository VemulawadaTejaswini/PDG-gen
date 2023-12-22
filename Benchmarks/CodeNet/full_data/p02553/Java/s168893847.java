import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long ans=Long.MIN_VALUE;;
    long[] arr = new long[4];
    arr[0]=a*c;
    arr[1]=a*d;
    arr[2]=b*c;
    arr[3]=b*d;
    for(int i=0;i<4;i++){
      if(arr[i]>ans){
        ans=arr[i];
      }
    }
    System.out.println(ans);
  }
}