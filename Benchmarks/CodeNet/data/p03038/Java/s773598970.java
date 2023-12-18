import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    int[] b = new int[m];
    int[] c = new int[m];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<m;i++){
      b[i]=sc.nextInt();
      c[i]=sc.nextInt();
      if(map.containsKey(-c[i]))map.put(-c[i],map.get(-c[i])+b[i]);
      else map.put(-c[i],b[i]);
    }
    Object[] mapKey = map.keySet().toArray();
    Arrays.sort(mapKey);
    int[] memo = new int[n];
    int sum = 0;
    Arrays.fill(memo,-1000000000);
    for(Integer key:map.keySet()){
      int x = map.get(key);
      for(int i=sum;i<=Math.min(sum+x-1,n-1);i++)memo[i]=-key;
      sum+=x;
    }
    Arrays.sort(a);
    Arrays.sort(memo);
    long ans = 0;
    for(int j=0;j<n;j++)ans+=(long)Math.max(memo[n-j-1],a[j]);
    System.out.println(ans);
  }
}