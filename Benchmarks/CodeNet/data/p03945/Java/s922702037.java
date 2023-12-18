
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	String S = scan.next();
	int count = 0;
	for (int i = 0; i < S.length()-1; i++) {
	    if(S.charAt(i) != S.charAt(i+1)) count++;
	}

	System.out.println(count);
	scan.close();
    }
}
