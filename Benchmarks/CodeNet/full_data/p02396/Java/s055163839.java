import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
             int x;
	     for(int count = 1; ;count++){
	    	 x  = scan.nextInt();
	    	 if(x == 0)break;
	    	 System.out.println("Count" + count + ":" + x);
	     }


	}

}