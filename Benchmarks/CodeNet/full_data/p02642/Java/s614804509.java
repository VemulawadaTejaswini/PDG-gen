import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//スキャナー
		Scanner s = new Scanner(System.in);


		int numn = s.nextInt();
		
		int[] nums = new int[numn];
		
		for (int i = 0 ; i < numn ; i++) {
			
			nums[i] = s.nextInt();
			
		}
		
		s.close();
		
		Arrays.sort(nums);
		
		int ansCount = 0;
		
		for(int i = 0 ; i < numn ; i++) {
			
			boolean app = true;
			
			for(int j = 0; j < i ; j++) {
				
				if(nums[i]%nums[j]==0) {
					app = false;
					break;
					
				}
				
			}
			
			if(app) {
				//全部で割り切れない
				ansCount++;
			}
			
		}
		
		System.out.println(ansCount);

	}

}
