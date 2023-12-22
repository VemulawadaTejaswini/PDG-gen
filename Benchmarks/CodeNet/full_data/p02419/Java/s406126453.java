import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String W = stdIn.next();
		W = W.toLowerCase();
		int k = 0;
		while(true) {
			String T = stdIn.nextLine();
			if(T.equals("END_OF_TEXT")) {
				break;
			}
			T = T.toLowerCase();
			for(int i = 0; i < T.length(); i++) {
				if(T.startsWith(W, i)) {
					k++;
				}
			}
		}
		System.out.println(k);
	}
}