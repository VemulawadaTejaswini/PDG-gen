import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
      	int n = sc.nextInt();
      	int k = sc.nextInt();
     	int as[] = new int[n];
      	int stack = 1;
      	int stack2 = 1;
      
      	for(int i = 0;i < n;i++) as[i] = sc.nextInt();
      
      	for(int i = 0;i < k;i++) stack *= as[i];
       	
      	for(int i = k;i < n;i++){
        	for(int j = i - k + 1;j < i + 1;j++) stack2 *= as[i];
          	if(stack2 > stack) System.out.println("Yes");
          	else System.out.println("No");
          	stack = stack2;
          	stack2 = 1;
        }
	}
}
