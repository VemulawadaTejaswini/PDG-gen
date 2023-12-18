import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] e = new int[n+1];
    for(int i=1;i<=n;i++){
      int t=i;
      for(int j=2;j<=t;j++){
        while(t%j==0){
          e[j]++;
          t/=j;
        }
      }
    }
    int cnt2 = 0;
    int cnt4 = 0;
    int cnt14 = 0;
    int cnt24 = 0;
    int cnt74 = 0;
    int ans = 0;
    for(int i=2;i<=n;i++){
      if(e[i]>=2)cnt2++;
      if(e[i]>=4)cnt4++;
      if(e[i]>=14)cnt14++;
      if(e[i]>=24)cnt24++;
      if(e[i]>=74)cnt74++;
    }
    ans=cnt74+cnt24*(cnt2-1)+cnt14*(cnt4-1)+cnt4*(cnt4-1)*(cnt2-2)/2;
    System.out.println(ans);
  }
}