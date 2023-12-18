import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    int max = 0;
    int sum = 0;
    int stack;
    
    for(int i = 0;i < n;i++){
      	stack = sc.nextInt();
    	sum += stack;
      	if(stack > max) max = stack;
    }
    
    if(sum - max > max)System.out.println("Yes");
    else System.out.println("No");

  }
}
