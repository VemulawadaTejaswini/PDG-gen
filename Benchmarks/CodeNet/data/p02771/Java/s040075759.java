import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int nums[] = new int[3];
      	boolean por = false;
      	
      	for(int i=0; i < 3;i++) nums[i] = sc.nextInt();
      	Arrays.sort(nums);
      
      	if(nums[0] == nums[1]){
        	if(nums[0] != nums[2]) por = true;
        } else if(nums[1] == nums[2]){
        	if(nums[1] != nums[0]) por = true;
        }
      
      	if(por) System.out.println("Yes");
      	else System.out.println("No");
	}
}
