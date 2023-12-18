
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int bad = -100;
		int count = n;
		for(int i=1;i<n;i++) {
			if (s.charAt(i)==s.charAt(i-1) && i-bad > 2) {
				count--;
				bad=i;
			}
		}
		
		
		System.out.println(count);
	}



}