import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0) break;
			for(int j=0;j<(H-H%2)/2;j++){
		    	for(int i=0;i<(W-W%2)/2;i++){
			    	System.out.print("#.");
			    	}
		    	if(W%2==1) System.out.print("#");
		    	System.out.println();
		    	for(int i=0;i<(W-W%2)/2;i++){
		    		System.out.print(".#");
		    		}
		    	if(W%2==1) System.out.print(".");
		    	System.out.println();
			}
			if(H%2==1){
				for(int i=0;i<(W-W%2)/2;i++){
			    	System.out.print("#.");
			    	}
		    	if(W%2==1) System.out.print("#");
		    	System.out.println();
			}
			System.out.println();
		}
	}
}