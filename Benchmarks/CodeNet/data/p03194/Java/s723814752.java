import java.util.*;
public class Main{
  public static Map<Long,Long> map = new HashMap<>();
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long P = sc.nextLong();
    bunkai(P);
    long ans = 1;
    for(Long n : map.keySet()){
      if(map.get(n) >= N){
        long tmp = map.get(n) / N;
        ans *= n * tmp;
      }
    }
    System.out.println(ans);
  }
  
  public static void bunkai(long n){
    for(long i = 2; i <= n; i++){
      if(n % i == 0){
        long count = 1;
        long tmp = i * i;
        while(n % tmp == 0){
          count++;
          tmp *= i;
        }
        if(map.containsKey(i)){
          count += map.get(i);
        }
        map.put(i, count);
        n /= pow(i, count);
      }
    }
  }
  
  public static long pow(long x, long y){
    long ans = 1;
    for(long i = 0; i < y; i++){
      ans *= x;
    }
    return ans;
  }
}