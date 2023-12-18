import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        Set<String> set = new HashSet<>();
        set.add("AKIHABARA");
        set.add("KIHABARA");
        set.add("AKIHBARA");
        set.add("AKIHABRA");
        set.add("AKIHABAR");
        set.add("KIHBARA");
        set.add("KIHABRA");
        set.add("KIHABAR");
        set.add("AKIHBRA");
        set.add("AKIHBAR");
        set.add("AKIHABR");
        set.add("KIHBRA");
        set.add("KIHBAR");
        set.add("KIHABR");
        set.add("AKIHBR");
        set.add("KIHBR");
        if (set.contains(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
