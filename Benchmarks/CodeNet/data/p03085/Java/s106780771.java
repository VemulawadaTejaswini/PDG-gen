import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.equals("A")) {
			System.out.println("T");
		}
		else if(S.equals("T")) {
			System.out.println("A");
		}
		else if(S.equals("C")) {
			System.out.println("G");
		}
		else {
			System.out.println("C");
		}
    }

}