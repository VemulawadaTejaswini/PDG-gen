
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] arg) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		String s=ob.next();
		int k=0;
		for (int i=0; i<=s.length()-3; i++) {
			if (s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C') {
				k++;
			}
		}
		System.out.println(k);
	}
}
