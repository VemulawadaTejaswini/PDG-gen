import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] s = stdIn.next().split("");
		String[] t = stdIn.next().split("");
		
		Arrays.sort(s);
		Arrays.sort(t);
		
		if(s.equals(t)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
