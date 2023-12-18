import java.util.Scanner;
import java.util.regex.Pattern;

public class A {

    public static void main(String[] args) {
	Scanner str = new Scanner(System.in);

	String S;
	String x[];

	do {
	    S = str.nextLine();

	    x = S.split("");
	} while (x.length != 4 || !Character.isUpperCase(S.charAt(0)) || !Character.isUpperCase(S.charAt(1)) || !Character.isUpperCase(S.charAt(2)) || !Character.isUpperCase(S.charAt(3)));

	int m = 0;

	for (int i = 0; i < x.length - 1; i++) {
	    for (int j = i + 1; j < x.length; j++) {
		if (x[i].compareTo(x[j]) == 0) {
		    m++;
		}
	    }
	}

	if (m == 2) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}