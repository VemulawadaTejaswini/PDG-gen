import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long nums[] = new long[4];
      	long ans;
      	long lstack;
  
      	for(int i = 0;i < 4;i++) nums[i] = sc.nextLong();
      	ans = nums[0] * nums[2];
      	for(int i = 0;i < 2;i++){
          for(int j = 0;j < 2;j++){
      		lstack = nums[i]*nums[2+j];
            if(lstack > ans) ans = lstack;
          }
        }
           
      	System.out.println(ans);
        
	}
}
