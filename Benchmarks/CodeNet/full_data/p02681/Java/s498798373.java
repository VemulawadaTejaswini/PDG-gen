import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String T = stdIn.next();
		if(S.equals(T.substring(0,S.length()))){
			if(S.length() == T.length() - 1){
				System.out.println("Yes");
			}
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}