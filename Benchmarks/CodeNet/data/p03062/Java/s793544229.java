import java.util.*;

public class Main {
  
  public int[] value;
  public int[] cost;
  
  public Main() {
  }
    
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int size = scan.nextInt();
    int[] num = new int[size];
	
    for(int i = 0; i < size; i++) {
      num[i] = scan.nextInt();
    }
    
    int sum = 0;
    
    for (int i = 0; i < size - 1; i++) {
      if (num[i] < 0) {
        num[i] = -num[i];
        num[i+1] = -num[i+1];
      }
      
      sum+= num[i];
    }
    
    sum += num[size - 1];
    System.out.println(sum);
    
  }
}
