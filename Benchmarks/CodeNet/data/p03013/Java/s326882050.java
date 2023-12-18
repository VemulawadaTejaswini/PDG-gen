import java.util.Scanner;
import java.util.HashMap;
class Main{
  static HashMap<Integer, Integer> memo = new HashMap<>();
  static int fib(int n) {
    if (memo.containsKey(n)) {
        return memo.get(n);
    } else if (n == 1 || n == 2) {
        return 1;
    } else {
        int fibn = fib(n-1) + fib(n-2);
        memo.put(n, fibn);
        return fibn;
      }
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] broken = new int[m];
    memo = new HashMap<>();
    for(int i = 0; i < m; i++){
      broken[i] = Integer.parseInt(sc.next());
    }

    boolean possible = true;
    int succesive_safe = 1;
    int succesive_broken = 0;
    Long total_way = 1L;
    int next_broken = 0;

    for(int i = 0; i < n; i++){
      if(i + 1 != broken[next_broken]){
        if(succesive_safe == 0){
          succesive_broken = 0;
        }
        succesive_safe++;
        System.out.println(succesive_safe);
      }else if(succesive_broken == 0){
        succesive_broken++;
        total_way = total_way * fib(succesive_safe) % 1000000007;
        succesive_safe = 0;
        if(next_broken != m - 1){
          next_broken++;
        }
      }else{
        possible = false;
        break;
      }
    }
    total_way = total_way * fib(succesive_safe) % 1000000007;
    if(possible){
      System.out.println(total_way);
    }else{
      System.out.println(0);
    }
  }
}