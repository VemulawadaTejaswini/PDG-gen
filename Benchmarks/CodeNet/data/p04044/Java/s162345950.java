import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }
        String ans = "";
        for (String string : set) {
            ans += string;
        }
        System.out.println(ans);
    }
}