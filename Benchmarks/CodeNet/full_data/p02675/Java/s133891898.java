import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String t = "";
		switch(n%10){
		case 3:
			t += "bon";
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			t += "pon";
			break;
		default:
			t += "hon";
		}
		System.out.println(t);
	}
}

