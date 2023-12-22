import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	for(int i = 1; i <= n; i++){
    	  int x = i;
    	
    	  if(i % 3 == 0){
    		System.out.print(" " + i);
    	  }else if(i % 10 == 3){
    		System.out.print(" " + i);
    	  }else{
    	     for(;;){
        	if(x  / 10 < 10){
        		if(x % 10 == 3) {
        			System.out.print(" " + i);
       			}
       			break;
       		}else{
        		x /= 10;
        	}
             }
    	  }
  	
    	}
    	System.out.println("");
     }
}