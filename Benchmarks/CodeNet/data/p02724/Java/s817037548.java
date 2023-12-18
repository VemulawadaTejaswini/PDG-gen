import java.util.*;
public class Main {

	public static void main(String[] args) {
		
				

		Scanner scan = new Scanner(System.in);
		
		long xx = scan.nextLong();
		long result = 1000 * xx/500 + 5 * xx%500/5;
		System.out.println(result);
	}

}
