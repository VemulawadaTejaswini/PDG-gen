import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    scan.close();
	    for(int i=x;i>=1;i--) {
	    	if(i*i<x) {
	    	    System.out.println(i*i);
	    		break;
	    	}
	    }
	}

}
