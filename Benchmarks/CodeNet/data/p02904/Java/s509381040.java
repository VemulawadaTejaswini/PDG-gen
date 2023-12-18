import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] p = new int[n];
    for(int i=0;i<n;i++)p[i]=sc.nextInt();
    int ans = 1;
    TreeSet<Integer> ts = new TreeSet<>();
    for(int i=0;i<n;i++){
      ts.add(p[i]);
      if(i>=k){
        if(ts.first()!=p[i-k]||ts.last()!=p[i])ans++;
        ts.remove(p[i-k]);
      }
    }
    int not = 0;
    int cnt = 1;
    for(int i=1;i<n;i++){
      if(p[i-1]<p[i]){
        cnt++;
        if(cnt==k){
          not++;
        }
      }else cnt=1;
    }
    if(not>=2)System.out.println(ans-(not-1));
    else System.out.println(ans);
  }
}