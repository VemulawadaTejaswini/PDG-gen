import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long goal = sc.nextLong();
      	long i = 1;
      	long num1 = 1;
      	long num2 = goal;
      
      	while(i <= num2/i){
          if(goal % i == 0) {
            num1 = i;
            num2 = goal/i;
          }
          i++;
        }
 		
      	System.out.println(num1 + num2 - 2);
        
	}
}
