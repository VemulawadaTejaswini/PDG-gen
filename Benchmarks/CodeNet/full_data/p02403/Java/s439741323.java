import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		for(;;){
			int h = scan.nextInt();
			int w = scan.nextInt();

			if(h == 0 && w == 0)
				break;

			System.out.println(String.join("", Collections.nCopies(h, String.join("", Collections.nCopies(w, "#"))+"\n")));
		}
	}
}

