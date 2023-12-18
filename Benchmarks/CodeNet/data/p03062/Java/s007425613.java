import java.util.*;
import java.lang.Math;
import Java.lang.Integer;

public class Main {
  
  private int sum = INTEGER.MIN_VALUE;
  private int size;
  
  public Main() {
  }
  
  public void getSum (int[] num, int index, int temp) {
    if (index == this.size - 1) {
      sum = Math.min(temp + num[index], this.sum);
      return;
    }
    
    getSum(num, index++, temp+num[index]);
    
    num[index] = -num[index];
    num[index + 1] = -num[index + 1];
    
    getSum(num, index++, temp+num[index]);
    num[index] = -num[index];
    num[index + 1] = -num[index + 1];
    
  }
    
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int size = scan.nextInt();
    int[] num = new int[size];
	
    for(int i = 0; i < size; i++) {
      num[i] = scan.nextInt();
    }
    
    Main obj = new Main();
    obj.size = size;
    obj.getSum(num, 0, 0);
    
    System.out.println(obj.sum);
    
  }
}
