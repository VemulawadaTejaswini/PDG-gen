import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String temp = s.substring(0, 1);

		int len = s.length();
		int i;
		for(i = 1; i < len; i++) {
			if(temp.equals(s.substring(i, i + 1))){
				System.out.println("Bad");
				return;
			}else {

				temp = s.substring(i, i + 1);
			}
		}
		System.out.println("Good");
	}
}
