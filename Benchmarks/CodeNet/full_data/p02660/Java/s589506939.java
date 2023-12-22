import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int answer = 0;
    HashMap<Long, Long> primeMap = new HashMap<>();

    long divide = 2;
    while(n % divide == 0){
      if(primeMap.get(divide) == null){
        primeMap.put(divide, 1l);
      } else {
        long v = primeMap.get(divide);
        primeMap.put(divide, v + 1l);
      }
      n /= divide;
    }
    divide = 3;
    while(n != 1){
      if(n % divide == 0){
        if(primeMap.get(divide) == null){
          primeMap.put(divide, 1l);
        } else {
          long v = primeMap.get(divide);
          primeMap.put(divide, v + 1l);
        }
        n /= divide;
        continue;
      } else {
        divide += 2;
      }
    }

    Set<Long> key = primeMap.keySet();
    for(Long val : key){
      long cnt = primeMap.get(val);
      long wk = 1l;
      long cnt2 = 0;
      while(cnt >= wk){
        cnt = cnt - wk;
        wk++;
        cnt2++;
      }
      answer += cnt2;
    }
    System.out.print(answer);
  }
}