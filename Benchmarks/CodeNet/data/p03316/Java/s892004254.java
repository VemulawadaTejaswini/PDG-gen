import java.util.Scanner;


public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String n = sc.next();
	    int sn = 0;
	    for(int i = 0; i < n.length(); i++) {
	    	sn += Integer.parseInt(n.substring(i, i+1));
	    }
	    if(Integer.parseInt(n) % sn == 0) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}
}