import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            String many = "";
            String few = "";
            
            if(a < b){
            	many = "#";
            	few = ".";
            }else{
            	many = ".";
            	few = "#";
            }
            
            //出力
            System.out.println(64 + " " + 63);
            
            printrow(Math.max(a, b)-1, many, few, 31);
            
            for(int i=0; i<63; i++){
    			System.out.print(few);
    		}
    		System.out.println("");
    		
    		for(int i=0; i<63; i++){
    			System.out.print(many);
    		}
    		System.out.println("");
    		
    		printrow(Math.min(a, b)-1, few, many, 31);
            
            sc.close();
        }
        
        public static void printrow(int n, String many, String few, int count){
        	if(count==0){
        		return;
        	}else if(count%2 == 0){
        		for(int i=0; i<63; i++){
        			System.out.print(few);
        		}
        		System.out.println("");
        		printrow(n, many, few, count-1);
        	}else if(n > 32){
        		for(int i=0; i<31; i++){
        			System.out.print(many + few);
        		}
        		System.out.println(many);
        		printrow(n-32, many, few, count-1);
        	}else if(n==0){
        		for(int i=0; i<63; i++){
        			System.out.print(few);
        		}
        		System.out.println("");
        		printrow(0, many, few, count-1);
        	}else{
        		for(int i=0; i<n; i++){
        			System.out.print(many + few);
        		}
        		for(int i=0; i<63-2*n; i++){
        			System.out.print(few);
        		}
        		System.out.println("");
        		printrow(0, many, few, count-1);
        	}	
        }
	}
	