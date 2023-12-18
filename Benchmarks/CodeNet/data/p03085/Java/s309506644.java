import java.util.*;
public class Main {

	/*
	 * 122A
	 * 
	 * To read a character we can read it as a string and do .charAt(0) for it to be a character
	 * A <--> T
	 * C <--> G
	 * When you get one character output the other one
	 * Can be done with if statements like below
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) == 'A') {
			System.out.println('T');
		}
		else if(s.charAt(0) == 'T') {
			System.out.println('A');
		}
		else if(s.charAt(0) == 'G') {
			System.out.println('C');
		}
		else {
			System.out.println('G');
		}
	}

}
