import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = 0; i < z; i++) {
            if (y - x >= 0) {
                y -= x;
                cnt++;
            } else {
                System.out.println(cnt);
                return;
            }
        }
    }
}