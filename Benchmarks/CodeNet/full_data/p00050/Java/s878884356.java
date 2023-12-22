import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String t = sc.nextLine();
			
			
			t = t.replace("apple","JWU");
			t = t.replace("peach","apple");
			t = t.replace("JWU","peach");
			
			System.out.println(t);  
		}
	}

}


