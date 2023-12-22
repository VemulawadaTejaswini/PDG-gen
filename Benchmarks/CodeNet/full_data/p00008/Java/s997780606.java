import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int a, b, c, d;
    	int week;
    	while (scan.hasNextInt()){
    		int num = scan.nextInt();
    		int count = 0;
    		for(int i = 0; i < 10; i++){
    			for(int j = 0; j < 10; j++){
    				for(int x = 0; x < 10; x++){
        				for(int y = 0; y < 10; y++){
        					if(i+j+x+y == num){
        						count++;
        					}
        				}
        			}
    			}    			
    		}
    		System.out.println(count);
    	}
    }
}