import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String n = scan.nextLine();
	while (!n.equals("-")) {
	    int m = scan.nextInt();
	    scan.nextLine();
	    String newN = n;
	    for (int i = 0; i < m; i++) {
		String hs = scan.nextLine();
		int h = Integer.valueOf(hs);
		newN = newN.substring(h, newN.length()) + newN.substring(0, h);
	    }
	    System.out.println(newN);
	    n = scan.nextLine();
	}
    }
}