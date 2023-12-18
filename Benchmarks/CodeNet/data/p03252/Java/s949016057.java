import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            set1.add(S.charAt(i));
            set2.add(T.charAt(i));
        }
        if (set1.size() == set2.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}