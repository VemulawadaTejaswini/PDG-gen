import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int nums[] = new int[3];
      	boolean bef = false;
      	
      	for(int i=0; i < 3;i++) nums[i] = sc.nextInt();
      
      	if(nums[1] - nums[0] == nums[2] - nums[1]) bef = true;
      
      	if(bef) System.out.println("Yes");
      	else System.out.println("No");
	}
}
