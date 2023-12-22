import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int n;
    	
    	for(n=scn.nextInt(); n!=0; n=scn.nextInt()){
    		boolean flag = false;
    		int num;
    		
    		label: for(int i=0; i<n; i++){
    			int[] list = new int[4000];
    			int exceed = 0;
    			
    			num = scn.nextInt();
    			
    			for(int j=0; j<exceed; j++)
    				if(list[j] == num){
    					scn.nextInt();
    					scn.nextInt();
    					continue label;
    				}
    					
    			if(scn.nextInt() * scn.nextInt() >= 1000000){
    				flag = true;
    				exceed++;
    				System.out.println(num);
    			}
    		}
    		
    		if(flag)
    			System.out.println("NA");
    	}
    }
}