import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> freq = new HashMap<>();
      for(int i = 0; i < n; i++) {
        int num = sc.nextInt();
        freq.put(num, freq.getOrDefault(num, 0) + 1);
      }
      int cnt = 0;
      for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        int key = entry.getKey();
        int val = entry.getValue();
        if(key == val) continue;
        if(key > val) cnt += val;
        else cnt += val - key;
      }

      System.out.println(cnt);
  }
}