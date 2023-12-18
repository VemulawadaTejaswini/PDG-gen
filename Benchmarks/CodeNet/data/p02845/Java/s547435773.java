import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    long[] cnt = new long[n];
    long ans = 1;
    long mod = 1000000007;
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    long cnt0 = 0;
    for(int i=0;i<n;i++){
      if(a[i]==0)cnt0++;
      cnt[a[i]]++;
      if(cnt[a[i]]>=4){
        System.out.println(0);
        return;
      }
      if(a[i]==0)ans*=(4-cnt0);
      else{
        ans*=cnt[a[i]-1];
        ans=ans%mod;
        cnt[a[i]-1]--;
      }
    }
    System.out.println(ans);
  }
}