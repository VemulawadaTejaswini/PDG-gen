import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		while(true){
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
	    int W = scan.nextInt();

	    if(H == 0 && W == 0)break;
	    for(int i = 0;i < H ;i++){
	    	for(int j = 0;j < W; j++){
	    		System.out.print("#");
	    	}
	    	System.out.println("\n");
	    }
	  
	   }
	}
}