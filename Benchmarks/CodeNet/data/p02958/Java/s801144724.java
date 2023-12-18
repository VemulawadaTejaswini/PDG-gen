import java.util.*;
 
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] array = new int[n];
    
    for (int i = 0; i < n; i ++) {
      array[i] = sc.nextInt();
    }
    
    // At least 3 elements NOT satisfy array[i] = i, cannot sort in ASC
    int count = 0;
    String result = "YES";
    
    for (int j = 0; j < n; j ++) {
      if (array[j] != j) {
        count ++;
        if (count == 2) {
          result = "NO";
          break;
        }
      }
    }
    
    System.out.println(result);
  }
  
}