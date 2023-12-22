import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(), zero = 0;
		long ans = 1, base = 1000000000000000000;
		long nums[] = new long[size];
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextLong();
			if(nums[i] == 0){zero++;}
		}
        if(zero > 0){System.out.println("0"); return;}
		
		for(long num : nums){
            if(num <= base/ans){
				ans *= nums[i];
			} else {System.out.println("-1"); return;}
        }
        System.out.println(ans);
	}
}