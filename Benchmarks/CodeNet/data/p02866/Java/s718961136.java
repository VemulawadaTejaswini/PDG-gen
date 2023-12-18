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
    int count = 1;
    int count2 = 0;
    int now = 1;
    for(int i = 1; i < N; i++){
      int n = list.get(i);
      if(n == now){
        count2++;
        if(i == N-1){
          ans *= calc(count, count2);
          ans %= p;
        }
      }else{
        ans *= calc(count, count2);
        ans %= p;
        count = count2;
        count2 = 1;
        now = n;
        
        if(i == N-1){
          ans *= n;
          ans %= p;
        }
      }
    }
    System.out.println(ans);
  }
  static long calc(int a, int b){
    long A = a;
    long B = b;
    return (long)Math.pow(A,B);
  }
}