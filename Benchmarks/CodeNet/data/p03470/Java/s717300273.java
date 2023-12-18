import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    void doIt() {
	int n =	sc.nextInt();
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i = 0; i < n; i++) {
            hs.add(sc.nextInt());
        }
	System.out.println(hs.size());
    }
    public static void main(String args[]) {
	new Main().doIt();
    }
}
