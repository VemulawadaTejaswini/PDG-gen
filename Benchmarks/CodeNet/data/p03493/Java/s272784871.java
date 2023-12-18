import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String substr;
	int count = 0;
	
	for (int i=0; i<str.length(); i++) {
		substr = str.substring(i, i+1);
		if ("1" == substr) {
			count ++;
		}
	}
	System.out.println(count);
}
