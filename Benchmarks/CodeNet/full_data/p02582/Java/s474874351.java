import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String k = sc.nextLine();
	    int returnnum = 0;
	    if (k.contains("RRR")) {
	    	returnnum = 3;
	    } else if (k.contains("RR")) {
	    	returnnum = 2;
	    } else if (k.contains("R")) {
	    	returnnum = 1;
	    }
	    System.out.println(returnnum);
	}
}
