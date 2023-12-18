import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    void doIt() {
        StringBuilder sb	= new StringBuilder(sc.next());
	sb.setCharAt(3,'8');
	System.out.println(sb.toString());
    }
    public static void main(String args[]) {
	new Main().doIt();
    }
}
