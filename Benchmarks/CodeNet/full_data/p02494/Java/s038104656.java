import java.util.Scanner;

public class Main{
	 public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
	        int h = input.nextInt();
	        int w = input.nextInt();
	        
	        if ( h !=0 && w !=0){
	        	for (int i=0;i<h;i++){
	        		for (int j=0;j<w;j++){
	        			System.out.print("#");
	        		}	
	        		System.out.println();
	        	}
	        }
	 }
}