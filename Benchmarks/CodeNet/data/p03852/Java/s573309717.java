import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String c = scan.next();
		String str = "consonant";
		switch(c){
		case "a":
		case "i":
		case "u":
		case "e":
		case "o":
			str = "vowel";
		}
		System.out.println(str);
	}
}
