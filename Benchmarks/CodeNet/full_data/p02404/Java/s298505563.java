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

			String ht = String.join("", Collections.nCopies(w, "#"))+"\n";
			String md = "#"+String.join("", Collections.nCopies(w-2, "."))+"#\n";
			System.out.println(ht + String.join("", Collections.nCopies(h-2, md)) + ht);
		}
	}
}

