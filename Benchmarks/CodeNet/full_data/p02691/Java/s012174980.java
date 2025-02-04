import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Long, Long> freqMap = new HashMap<>();
      freqMap.put(1 + sc.nextLong(), 1L);
      long cnt = 0L;
      for(int i = 2; i <= n; i++) {
        long num = sc.nextInt();
        cnt += freqMap.getOrDefault(i - num, 0L);
        freqMap.put(i + num, freqMap.getOrDefault(i + num, 0L) + 1);
      }

      System.out.println(cnt);
  }
}