import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int minSum = 0;

    List<Integer> origins = new ArrayList<>();
    for(int i = 0; i < n;){
      int a = sc.nextInt();
      origins.add(a);
      minSum += Math.abs(a - ++i);
    }
    int minusMinSum = minSum;
    
    List<Integer> list = new ArrayList<>(new HashSet<>(origins));
    Collections.sort(list);
    for(int num : list){
      int tmp = 0;
      int i = 0;
      for(int a : origins) {
        tmp += Math.abs(a - (++i + num));
      }
      
      if(minSum <= tmp){
        break;
      }
      minSum = tmp;
    }
    
    Collections.sort(list, Collections.reverseOrder());
    for(int num : list){
      int tmp = 0;
      int i = 0;
      for(int a : origins) {
        tmp += Math.abs(a - (++i - num));
      }
      
      if(minusMinSum <= tmp){
        break;
      }
      minusMinSum = tmp;
    }
    
    System.out.println(minSum < minusMinSum ? minSum : minusMinSum);
    return;
  }
}