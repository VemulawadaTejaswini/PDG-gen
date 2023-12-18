import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] d = new long[n];
    for(int i=0;i<n;i++)d[i]=sc.nextLong();
    if(d[0]!=0){
      System.out.println(0);
      return;
    }
    Arrays.sort(d);
    for(int i=1;i<n;i++)if(d[i]>d[i-1]+1){
      System.out.println(0);
      return;
    }
    if(d[1]==0){
      System.out.println(0);
      return;
    }
    long ans = 1;
    long cnt = 0;
    long sum = 1;
    long pre =1;
    long j = 1;
    while(sum<(long)n){
      for(int i=0;i<n;i++){
        if(d[i]==j)cnt++;
        else if(d[i]>j) break;
      }
      if(cnt!=0){
        ans*=(long)Math.pow(pre,cnt);
        ans=ans%998244353;
        sum+=cnt;
        pre=cnt;
      }
      j++;
      cnt=0;
    }
    System.out.println(ans);
  }
}