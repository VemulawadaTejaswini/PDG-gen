import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int n = sc.nextInt();
      	long nums[] = new long[n];
      	long ans = 1;
      	boolean con = true;
      	long zero = 0; 
      	long limit = 1000000000;
      	limit *= 1000000000;
      	for(int i = 0;i < n; i++) {
          nums[i] = sc.nextLong();
          if(nums[i] == 0) ans = 0; 
        }
      
      	if(ans != 0) {
          ans = nums[0];
          limit /= nums[0];
        }
           
      	for(int i = 1;i < n && ans != 0; i++) {
          	if(nums[i] > limit) con = false;
          	if(con){
              ans *= nums[i];
              limit /= nums[i];
            }
        }
      
      	if(con) System.out.println(ans);
      	else System.out.println("-1");
        
	}
}
