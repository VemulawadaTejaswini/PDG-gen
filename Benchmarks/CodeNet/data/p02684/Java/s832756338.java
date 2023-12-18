import java.util.*;
//kaze wo hiiteite atama ga mawaranai node kokode ittann owaru
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt()-1;
    }
    int now = 0;
    Map<Integer,Integer> m = new HashMap<>();
    int ans = 0;
    int m1 = -1;
    long shuuki = 0;
    for(int i = 0;i<n;i++){
      if(m.containsKey(now)){
        m1 = m.get(now);
        int m2 = i;
        shuuki = (long)m2 - (long)m1;
      }else{
        m.put(now,i);
      }
      now = a[now];
    }
    shuuki = k-(long) % shuuki;
    System.out.println(ans);


  }
}
