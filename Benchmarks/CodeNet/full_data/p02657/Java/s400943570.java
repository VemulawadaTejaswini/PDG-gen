import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int n = sc.nextInt();
      	long nums[] = new long[n];
      	long ans = 1;
      	boolean con = true;
      
      	for(int i = 0;i < n && con; i++) {
          nums[i] = sc.nextLong();
          if(nums[i] == 0) con = false;
        }
      
      	for(int i = 0;i < n && con; i++) {
      		ans *= nums[i];
      		if(Math.log(ans) > 18) con = false;
        }
      	if(con) System.out.println(ans);
      	else System.out.println(-1);
        
	}
}
