import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int w,h;
    	while(true){
	    	h = scan.nextInt();
	    	w = scan.nextInt();
	    	for(int i=0;i<h;i++){
	    		for(int j=0;j<w;j++) System.out.print("#");
	    		System.out.println();
	    	}
	    	System.out.println();
    	}
    }
}