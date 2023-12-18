import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    Map<Integer,Integer> m = new HashMap<>();
    long co = 0l;
    int count = 0;
    int[] ju = new int[n+1];

    for(int i = 0;i<n;i++){
      int a = sc.nextInt();
      if(m.containsKey(a)){
        int aa = m.get(a);
        aa++;
        m.put(a,aa);
        if(m.get(a)==2){
          count++;
          ju[count] = a;
        }
        if(m.get(a)==3){
          break;
        }
      }else{
        co++;
        m.put(a,1);
      }
    }
    ju[count+1] = ju[1];
    k -= co;
    k %= (long)count;
    if(k == 0l)k=count;
    int kk = (int)k;
    System.out.println(ju[kk+1]);
  }
}
