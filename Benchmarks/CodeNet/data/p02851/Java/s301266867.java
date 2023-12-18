import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n+1];
    for(int i=0;i<n;i++)a[i]=sc.nextLong();
    long[] s = new long[n+1];
    long ans = 0;
    Map<Long,Long> map = new HashMap<Long,Long>();
    for(int i=0;i<n;i++)s[i+1]=(s[i]+a[i]-1)%k;
    int j=0;
    for(int i=0;i<=n;i++){
      if(i-j==k){
        map.put(s[i],map.get(s[j])-1);
        j++;
      }
      if(map.containsKey(s[i])){
        ans+=map.get(s[i]);
        map.put(s[i],map.get(s[i])+1);
      }else{
        map.put(s[i],1L);
      }
    }
    System.out.println(ans);
  }
}
