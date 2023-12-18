import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
    	
        ArrayList<Integer> nums = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        int fare = 0;
        //入力値取得
    	while(sc.hasNext()){
        	// リストに格納
          	int i = sc.nextInt();
            nums.add(i);
        }
    
    if(nums.get(1) < nums.get(2)){
    	fare = nums.get(0) * nums.get(1);
    }else{
    	fare = nums.get(0) * nums.get(2);    
    }
    
    System.out.println(fare);
    }
}