import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] n ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
				"r","s","t","u","v","w","x","y","z"};

		Scanner sc = new Scanner(System.in);
		String C = sc.next();

		for(int i=0; i < n.length; i++) {
			if(C.equals(n[i])) {
				System.out.println(n[i+1]);
			}
		}
	}
}