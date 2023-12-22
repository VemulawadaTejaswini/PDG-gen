import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	boolean J = true;
	  	int i,j;
	  	
	  	while(J) {
	  		
		  	int  h = scanner.nextInt();			//入力
		  	int  w = scanner.nextInt();
		  	
		  	if( h == 0 && w == 0 )
		  		break;
	  		
		  	for(i = 1; i <= h ; i ++){
		  		for(j = 1; j <= w ; j++){
		  			if(j == w) 
		  				System.out.println("#");
		  			else{
		  				if(i == 1 || j == 1 || i == h)
		  					System.out.print("#");
		  				else
		  					System.out.print(".");
		  					
		  			}
		  		}
		  	}
		  	System.out.print("\n");
		  	
  		}
        scanner.close();
  }
}
