import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int value = 700;
		if ( s.charAt(0) == 'o' ) value+=100; 
		if ( s.charAt(1) == 'o' ) value+=100; 
		if ( s.charAt(2) == 'o' ) value+=100; 
		System.out.println(value);
	}	
}