import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('T');
        set.add('C');
        set.add('G');
        int max = 0;
        int count = 0;
        for( Character c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 1;
                max = Math.max(count, max);
                continue;
            }
            max = Math.max(count, max);
            count = 0;
        }
        System.out.println(max);
    }
}
