import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    for(int i = 0;i < n;i++)d[i]=sc.nextInt();
    int m = sc.nextInt();
    int[] t = new int[m];
    for(int i = 0;i < m;i++)t[i]=sc.nextInt();
    Arrays.sort(d);
    Arrays.sort(t);
    int cnt = 1;
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i < n-1;i++){
      if(d[i]==d[i+1])cnt++;
      else{
        map.put(d[i],cnt);
        cnt=1;
      }
    }
    map.put(d[n-1],cnt);
    boolean ans = true;
    cnt=1;
    for(int i = 0;i < m-1;i++){
      if(t[i]==t[i+1])cnt++;
      else{
        if(map.get(t[i])==null)ans=false;
        else if(map.get(t[i])<cnt)ans=false;
        cnt=1;
      }
    }
    if(map.get(t[m-1])==null)ans=false;
    else if(map.get(t[m-1])<cnt)ans=false;
    System.out.println((ans)?"YES":"NO");
  }
}
