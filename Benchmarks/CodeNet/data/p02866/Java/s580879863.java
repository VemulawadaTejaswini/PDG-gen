import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long ans = 1;
    long p = 998244353;
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if((i == 0 && n != 0) || (i != 0 && n == 0)){
        System.out.println(0);
        return;
      }
      list.add(n);
    }
    Collections.sort(list);
    int count = 0;
    int count2 = 0;
    int now = 2;
    for(int i = 1; i < N; i++){
      int n = list.get(i);
      if(n == 1){
        count++;
        continue;
      }
      if(n == now && i != N-1){
        count2++;
      }else{
        long M = calc(count2*count, count2);
        ans += M == 1 ? 0 : M;
        ans %= p;
        
        count = count2;
        count2 = 0;
        if(i == N-1 && now != n){
          ans += count;
          ans %= p;
        }
        now = n;
      }
    }
    System.out.println(ans);
  }
  static long calc(int a, int b){
    long A = 1;
    long B = 1;
    for(int i = 0; i < b; i++){
      A *= a-i;
      B *= b-i;
    }
    return A/B;
  }
}