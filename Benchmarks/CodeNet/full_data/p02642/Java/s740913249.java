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
      loop:
      for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      	if(entry.getValue() > 1) continue;
      	int num = entry.getKey();
      	for(int i = 1; i * i <= num && i <= num / i; i++) {
      		if(num % i == 0) {
      			int a = i;
      			int b = (num / i);
      			if(a != num && freq.containsKey(a) || b != num && freq.containsKey(b))
      				continue loop;
      		}
      	}
      	cnt++;
      }
      System.out.println(cnt);
      sc.close();
  }
}