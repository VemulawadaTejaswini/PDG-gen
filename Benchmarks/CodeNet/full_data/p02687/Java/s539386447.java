import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		if(S.equals("ABC")){
			System.out.println("ARC");
		}
		else{
			System.out.println("ABC");
		}
		stdIn.close();
	}
}