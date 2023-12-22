import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int n;
    	
    	for(n=scn.nextInt(); n!=0; n=scn.nextInt()){
    		boolean flag = false;
    		int num;
    		
    		for(int i=0; i<n; i++){
    			num = scn.nextInt();
    			if(scn.nextInt() * scn.nextInt() >= 1000000){
    				flag = true;
    				System.out.println(num);
    			}
    		}
    		
    		if(flag)
    			System.out.println("NA");
    	}
    }
}