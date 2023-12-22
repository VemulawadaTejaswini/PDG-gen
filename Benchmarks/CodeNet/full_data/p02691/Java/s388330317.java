import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> freqMap = new HashMap<>();
      freqMap.put(1 + sc.nextInt(), 1);
      int cnt = 0;
      for(int i = 2; i <= n; i++) {
        int num = sc.nextInt();
        cnt += freqMap.getOrDefault(i - num, 0);
        freqMap.put(i + num, freqMap.getOrDefault(i + num, 0) + 1);
      }

      System.out.println(cnt);
  }
}