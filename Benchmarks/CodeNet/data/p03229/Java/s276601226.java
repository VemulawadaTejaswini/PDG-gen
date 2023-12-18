import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+1];
    for(int i=1;i<=n;i++)a[i]=sc.nextLong();
    Arrays.sort(a);
    long sum1 = 0;
    long sum2 = 0;
    if(n%2==0){
      for(int i=n;i>=n/2+2;i--)sum1+=a[i]*2;
      sum1+=a[n/2+1];
      for(int i=n/2;i>=2;i--)sum1-=a[i]*2;
      sum1-=a[1];
    }else{
      for(int i=n;i>=n/2+3;i--)sum1+=a[i]*2;
      sum1+=a[n/2+2]+a[n/2+1];
      for(int i=n/2;i>=1;i--)sum1-=a[i]*2;
      for(int i=n;i>=n/2+2;i--)sum2+=a[i]*2;
      for(int i=1;i<=n/2-1;i++)sum2-=a[i]*2;
      sum2-=(a[n/2+1]+a[n/2]);
    }
    System.out.println(Math.max(sum1,sum2));
  }
}