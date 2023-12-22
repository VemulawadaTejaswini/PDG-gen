import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int H = sc.nextInt();
	    int W = sc.nextInt();
	    if(H==0&&W==0){
		break;
	    }
	    
	    if(H%2==0){
		for(int h=0;h<H/2;h++){
		    
		    if(W%2==0){
			for(int i=0;i<W/2;i++){
			    System.out.printf("#.");
			}
			System.out.printf("\n");

			for(int k=0;k<W/2;k++){
			    System.out.printf(".#");
			}
			System.out.printf("\n");
		    }else{
			for(int i=0;i<(W-1)/2;i++){
			    System.out.printf("#.");
			}
			System.out.printf("#\n");

			for(int k=0;k<(W-1)/2;k++){
			    System.out.printf(".#");
			}
			System.out.printf(".\n");
			
			
		    }
		}
	    }else{
		for(int h=0;h<(H-1)/2;h++){
		    
		    if(W%2==0){
			for(int i=0;i<W/2;i++){
			    System.out.printf("#.");
			}
			System.out.printf("\n");

			for(int k=0;k<W/2;k++){
			    System.out.printf(".#");
			}
			System.out.printf("\n");
			
		    }else{
			for(int i=0;i<(W-1)/2;i++){
			    System.out.printf("#.");
			}
			System.out.printf("#\n");

			for(int k=0;k<(W-1)/2;k++){
			    System.out.printf(".#");
			}
			System.out.printf(".\n");
			
			
		    }
		}

		for(int i=0;i<W/2;i++){
			    System.out.printf("#.");
	       	}
		if(W%2!=0){
		    System.out.printf("#\n");		
		}
	    }
	}
    }
}