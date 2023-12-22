import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		try(Scanner sc = new Scanner(System.in)){
	    while(true){
	    	int H = sc.nextInt();
	    	int W = sc.nextInt();
	    	if (H == 0 && W == 0){
	    		break;

	    	}
               for(int a=1;a<=H;a++);{
	     for(int b=1;b<=W;b++);{
	    		System.out.print("#");
	    	}
	    		System.out.println();
	    	}
	    	System.out.println();
	    }
}}