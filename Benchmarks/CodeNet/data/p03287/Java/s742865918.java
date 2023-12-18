import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    Map<Integer, Long> map = new HashMap<>();
    map.put(0, 1L);
    for(int i = 0, sum = 0; i < N; i++){
      sum = (sum + sc.nextInt()) % M;
      map.put(sum, map.getOrDefault(sum, 0L) + 1);
    }
    long ans = 0L;
    for(long i : map.values()){
      ans += i * (i - 1) / 2;
    }
    System.out.println(ans);
  }
}
