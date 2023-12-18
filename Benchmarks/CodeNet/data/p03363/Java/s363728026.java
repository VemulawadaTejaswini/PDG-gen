import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] s = new int[n];
    for(int i = 0;i < n;i++)a[i]=sc.nextInt();
    s[0]=a[0];
    for(int i = 1;i < n;i++)s[i]=s[i-1]+a[i];
    Arrays.sort(s);
    int ans = 0;
    int cnt = 1;
    for(int i = 0;i < n;i++)if(s[i]==0)ans++;
    for(int i = 0;i<n-1;i++){
      if(s[i]==s[i+1])cnt++;
      else{
        ans+= (cnt*(cnt-1))/2;
        cnt = 1;
      }
    }
    ans+=(cnt*(cnt-1))/2;
    System.out.println(ans);
  }
}