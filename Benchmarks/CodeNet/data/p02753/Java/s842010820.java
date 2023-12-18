import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int ansA = 0;
		int ansB = 0;
		for(int a = 0; a < S.length(); a++){
			if(S.charAt(a) == 'A'){
				ansA++;
			}
			else{
				ansB++;
			}
		}
		if(ansA == 3){
			System.out.println("No");
		}
		else if(ansB == 3){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		stdIn.close();
	}
}
