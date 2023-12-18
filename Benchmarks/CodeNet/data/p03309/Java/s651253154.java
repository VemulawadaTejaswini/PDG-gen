import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int minSum= 0;

    List<Integer> origins = new ArrayList<>();
    for(int i = 0; i < n;){
      int a = sc.nextInt();
      origins.add(a + ++i);
    }
    Collections.sort(origins);
    int i = origins.get(origins.size() / 2);

    for(int num : origins){
      minSum += Math.abs(num - i);
    }

    System.out.println(minSum);
    return;
  }
}