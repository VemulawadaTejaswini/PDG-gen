import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
 		int a_num = b - a - 1;
      	int a_val = 0;
      	int ans;
      
      	for(int i = 1;i <= a_num;i++) a_val += i;
      	ans = a_val - a;
          
      	System.out.println(ans);
        
	}
}
