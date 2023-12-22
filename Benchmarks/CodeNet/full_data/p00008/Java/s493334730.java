import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	int n = 0;
    	int count = 0;
    	n = scan.nextInt();
    	
    	for(int i = 0; i < 10;i++){
    		for(int k = 0; k < 10; k++){
    			for(int y = 0; y < 10; y++){
    				for(int j = 0; j < 10; j++){
    					
    					if(i+k+y+j == n){
    						count += 1;
    					}
    				}
    			}
    		}
    	}
    	System.out.println(count);
    	}
 }
}