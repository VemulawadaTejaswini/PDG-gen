import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn. nextLine();

		for(int i = str.length()-1; i >= 0; i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}