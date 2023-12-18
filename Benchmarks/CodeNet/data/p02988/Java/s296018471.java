import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
  		int nums[] = new int[s]; 
      	int count = 0;
      	
      	for(int i = 0;i < s; i++){
        	nums[i] = sc.nextInt();
        }
      
      	for(int i = 1;i < s-1; i++){
        	if((nums[i-1] < nums[i] && nums[i] < nums[i+1]) ||
               (nums[i-1] > nums[i] && nums[i] > nums[i+1])){
              count++;
            }
        }
 		
      	System.out.println(count);
        
	}
}
