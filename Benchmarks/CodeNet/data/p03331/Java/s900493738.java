import java.util.*;
public class Main {
  	public static int ds(int num){
      	int sum = 0;
      	while(num > 0){
          sum += num%10;
          num /= 10;
        }
      	return sum;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int n = sc.nextInt();
		int a;
      	int b;
      	int stack;
      	int min = -1;
      
      	for(int i = 1; i <= n/2;i++){
          a = i;
          b = n-i;
          stack = ds(a)+ds(b);
          if(stack < min || min == -1) min = stack;
        }
      
      	System.out.println(min);
	}
}