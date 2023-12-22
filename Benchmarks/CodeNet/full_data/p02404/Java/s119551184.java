import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int H;
    	int W;
    	
    	for(;;){
    		H = scan.nextInt();
        	W = scan.nextInt();
        	if(H == 0 && W == 0){
        		break;
        	}
        	
        	for(int y = 0; y < H; y++){
        		for(int x = 0; x < W; x++){
        			if(y != 0 && y != H-1 && x != 0 && x != W-1){
        				System.out.print(".");
        			}else{
        				System.out.print("#");
        			}
        		}
        		System.out.println("");
        	}
        	System.out.println("");
    	}
    	
     }
}