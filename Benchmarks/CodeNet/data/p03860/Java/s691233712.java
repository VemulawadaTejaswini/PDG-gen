import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x;
		x = in.nextLine();
	    String[] myName = x.split(" ");
	    for (int i = 0; i < myName.length; i++) {
	        String s = myName[i];
	        System.out.print(s.charAt(0));
	    }
	}

}