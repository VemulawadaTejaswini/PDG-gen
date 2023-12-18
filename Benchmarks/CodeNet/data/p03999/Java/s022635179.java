import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int nump = s.length()-1;
    int count = (int)Math.pow(2,nump);
    boolean pluses[] = new boolean[nump];
    long sum = 0;
    long stack;
    int stack2;
    
    for(int i = 0;i < nump;i++) pluses[i] = false;
      
    for(int i = 0;i < count;i++){
    	stack = i;
      	for(int j = 0; j < nump && stack > 0;j++){
          if(stack%2 == 1) pluses[j] = true;
          else pluses[j] = false;
          stack /= 2;
        }
        stack = (int)s.charAt(nump) - 48;
      	stack2 = 1;
      	for(int j = 0; j < nump;j++){
          if(pluses[j]){
            stack += (int)s.charAt(nump - 1 - j) - 48;
            stack2 = 1;
          }else {
            stack += ((long)s.charAt(nump - 1 - j) - 48) * (long)Math.pow(10,stack2);
            stack2++;
          }
        }
      	sum += stack;
    }
    	
  	System.out.println(sum);

  }
}
