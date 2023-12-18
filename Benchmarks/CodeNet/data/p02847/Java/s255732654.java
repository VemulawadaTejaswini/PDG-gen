import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String a[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; 
		for(int i=0 ; i<7 ; i++ ) {
			if(S.equals(a[i])) {
				System.out.println(7-i);
			}
		}
	}
}
