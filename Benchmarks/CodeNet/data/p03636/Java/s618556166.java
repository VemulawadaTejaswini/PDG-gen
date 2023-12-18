
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private String s;

    public Main() {
	s = scan.next();
	scan.close();
    }

    public final void answer() {
	StringBuilder str = new StringBuilder();
	str.append(s.charAt(0));
	str.append(s.length()-2);
	str.append(s.charAt(s.length()-1));

	System.out.println(str.toString());
    }
}
