import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	ArrayList<Integer> nums = new ArrayList<>();
      	int cnt = 0;
      	boolean xnor = true;	
      
      	// 値取得
        while(sc.hasNext()){
			nums.add(sc.nextInt());
        }
      
     // System.out.println(nums.get(3) ^ nums.get(1));
      for(int i = 1; i < nums.size(); i++ ){
        
        if(!xnor){
        	break;
        }
        int res = 0;
        int now = nums.get(i);
        
        //　両隣の排他的論理和を計算する
        if(i == nums.get(0)){
        	res = nums.get(i - 1) ^ nums.get(1);
        }else if(i == 1){
	        res = nums.get(0) ^ nums.get(i + 1);        
        }else{
	        res = nums.get(i - 1) ^ nums.get(i + 1);                
        }
		//System.out.println(res);
        if (res != now){
          xnor = false;           
        }        
        
      }
      // ビットごとの排他的論理和が等しい場合
      if(xnor){
      	System.out.println("Yes");
      }else{
        // 上記以外の場合
      	System.out.println("No");      
      }
    }
}