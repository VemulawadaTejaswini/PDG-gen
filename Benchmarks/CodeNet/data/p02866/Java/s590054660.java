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
    long count = 1;
    long count2 = 0;
    long now = 1;
    for(int i = 1; i < N; i++){
      int n = list.get(i);
      if(n == now){
        ans *= count;
        ans%= p;
        count2++;
      }else{
        count = count2;
        count2 = 1;
        ans *= count;
        ans %= p;
        now = n;
      }
    }
    System.out.println(ans);
  }
}