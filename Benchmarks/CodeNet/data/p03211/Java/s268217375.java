import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int stack;
    int num;
    int diff;
    int diff_min = 753;
    
   	for(int i = 0; i < s.length() -2; i++){
      stack = 0;
      for(int j = 0;j < 3;j++){
      	num = (int)s.charAt(i+j) - 48;
        stack += num * Math.pow(10,2-j);
      }
      diff = Math.abs(753 - stack);
      if(diff < diff_min) diff_min = diff;
      
    }
    
    System.out.println(diff_min);
  }
}
