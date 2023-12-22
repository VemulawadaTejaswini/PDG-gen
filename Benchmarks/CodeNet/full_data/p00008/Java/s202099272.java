import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextInt()){
	    	int n = input.nextInt();
	    	int count = 0;
	    	if(n > 36){
	    		System.out.println("0");
	    	}else{
	    		for(int i = 0 ; i <= 9 ; i++){
	    			for(int j = 0 ; j <= 9 ; j++){
	    				for(int k = 0 ; k <= 9 ; k++){
	    					for(int l = 0 ; l <= 9 ; l++){
	    						if((i+j+k+l) == n)count++;
	    					}
	    				}
	    			}
	    		}
	    		System.out.println(count);
	    	}
    	}
    }
}