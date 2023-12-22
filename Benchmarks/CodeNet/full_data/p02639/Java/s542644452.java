import java.util.*;

public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int[] nums = new int[5];
		int C = 0;

		for(int i = 0; i < 5; i++){
			nums[i] = ob.nextInt();
		}

		for(int j = 0; j < 5; j++){
			if(nums[j] == 0){
				C = j + 1;
				break;
			}
		}

		System.out.println(C);
	}
}
