import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.nextLine();
		
		StringBuffer sb = new StringBuffer(S);
		
		S = sb.reverse().toString();
		
		String[] word = {"maerd", "remaerd", "esare", "resare"};
		
		boolean canDivide = true;
		for(int i = 0; i < S.length();) {
			for(int j = 0; j < word.length; j ++) {
				canDivide = false;
				if(i + 5 <= S.length()) {
					if(S.subSequence(i, i + 5).equals(word[j])) {
						canDivide = true;
						i += 5;
						break;
					}
				}
				if(i + 6 <= S.length()) {
					if(S.subSequence(i, i + 6).equals(word[j])) {
						canDivide = true;
						i += 6;
						break;
					}
				}
			}
			if(!canDivide) {
				break;
			}
		}
		
		if(canDivide) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}