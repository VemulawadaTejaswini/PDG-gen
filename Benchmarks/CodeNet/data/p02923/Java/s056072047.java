import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int front = sc.nextInt();
    int current;
    int count = 0;
    int count_max = 0;
    
   	for(int i = 1; i < n; i++){
      current = sc.nextInt();
      if(current <= front) count++;
      else count = 0;
      if(count_max < count) count_max = count;
      front = current;
    }
    
    System.out.println(count_max);
  }
}
