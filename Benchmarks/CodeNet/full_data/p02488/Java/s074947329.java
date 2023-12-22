import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n; String ansWord="nothing", t;
		
		n = in.nextInt();
		for(int i=0;i<n;i++){
			t = in.next();
			if(
					t.charAt(0)
					< ansWord.charAt(0))
				ansWord = t;
		}
		
		System.out.println(ansWord);
	}
}