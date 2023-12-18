import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    sc.close();

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 1; i <= N; i++) {
  
      // 各桁の合計を出す
      String s = String.valueOf(i);

      String[] S = s.split("");
    
      int sum = 0;
    
      for (int j = 0; j < S.length; j++) {
        sum += Integer.valueOf(S[j]);
      }

      hashMap.put(i,sum);
    
    }

    int sum = 0;

    for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {

      if (A <= map.getValue() && map.getValue() <= B){
        sum += map.getKey();
      }
      
    }

    System.out.println(sum);

  }

}