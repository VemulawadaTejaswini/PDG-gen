import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] A = new int[N + 10];
    int count = 0;
    for (int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < N; i++){
      if (map.containsKey(A[i])){
        map.put(A[i], map.get(A[i]) + 1);
      } else {
        map.put(A[i], 1);
      }
    }
    ArrayList<Integer> list = new ArrayList<Integer>(map.values());
    Collections.sort(list);
    for (int i = 0; i < list.size() - K; i++){
      count += list.get(i);
    }
    System.out.println(count);
  }
}