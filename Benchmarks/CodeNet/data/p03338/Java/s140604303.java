import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        String s = sc.next();
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            Set s1 = new HashSet<Character>();
            for (char c : s.substring(0, i).toCharArray()) {
                s1.add(c);
            }
            int count = s1.size();
            for (char c : s.substring(i).toCharArray()) {
                s1.remove(c);
            }
            if (max < count - s1.size()) {
                max = count - s1.size();
            }
        }
        System.out.println(max);

    }
}