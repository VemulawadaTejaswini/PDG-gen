import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    int a = Integer.parseInt( scan.next());
	    int b = Integer.parseInt( scan.next());
	    
	    for(int i = 0;i<a;i++){
	    	for(int j = 0;j<b;j++){
	    		System.out.print("#");
	    	}
	    	System.out.println(" ");
	    }
	}
}