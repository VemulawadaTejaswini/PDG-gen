import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int[] a = new int[n];
    long mod = 1000000007;
    long sum = 0;
    long cnt1 = 0;
    long cnt2 = 0;
    for(int i = 0;i < n;i++)a[i]=sc.nextInt();
    for(int i = 0;i < n;i++){
      for(int j = i+1;j < n;j++)if(a[i]>a[j])cnt1++;
    }
    sum = (sum+cnt1*k)%mod;
    for(int i = 0;i < n;i++){
      for(int j = 0;j < n;j++)
        if(a[i]>a[j])cnt2++;
    }
    long s = cnt2*((k-1)*k)/2;
    sum=(sum+s)%mod;
    System.out.println(sum);
  }
}