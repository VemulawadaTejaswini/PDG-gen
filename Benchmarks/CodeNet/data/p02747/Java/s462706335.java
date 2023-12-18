import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] s = stdIn.next().split("");
		
		int cnth = 0;
		int cnti = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("h")){
				cnth++;
			}
			if(s[i].equals("i")) {
				cnti++;
			}
		}
		if(cnth == cnti) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
