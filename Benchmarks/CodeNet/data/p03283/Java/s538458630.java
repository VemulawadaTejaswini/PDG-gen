import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] param = sc.nextLine().split(" ");
    int N = Integer.parseInt(param[0]);
    int M = Integer.parseInt(param[1]);
    int Q = Integer.parseInt(param[2]);
    
    Map<Integer, Integer> mapM = new HashMap<>();
    Map<Integer, Integer> mapQ = new HashMap<>();
    
    for (int i = 0; i < M; i++) {
      String[] array = sc.nextLine().split(" ");
      int num1 = Integer.parseInt(array[0]);
      int num2 = Integer.parseInt(array[1]);
      mapM.put(num1, num2);
    }
    for (int i = 0; i < Q; i++) {
      String[] array = sc.nextLine().split(" ");
      int num1 = Integer.parseInt(array[0]);
      int num2 = Integer.parseInt(array[1]);
      mapQ.put(num1, num2);
    }
    
    for (Map.Entry<Integer, Integer> entryQ : mapQ.entrySet()) {
      int p_q = entryQ.getKey();
      int q_q = entryQ.getValue();
      int answer = 0;
      for (Map.Entry<Integer, Integer> entryM : mapM.entrySet()) {
        int p_m = entryM.getKey();
        int q_m = entryM.getValue();
        if (p_q <= p_m && q_m <= q_q) {
          answer++;
        }
      }
      System.out.println(answer);
    }
  }
}