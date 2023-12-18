import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        ArrayList<Character> ss = new ArrayList<>();
        ss.add(s[0]);
        for (int i = 1; i < s.length; i++) {
            if(s[i - 1] != s[i]) {
                ss.add(s[i]);
            }
        }
        System.out.println(ss.size() - 1);
    }
}