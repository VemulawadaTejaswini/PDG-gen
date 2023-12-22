import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine().toLowerCase();
            HashMap<Character, Integer> m = new HashMap<>();
            for (char c = 'a'; c <= 'z'; c++) {
                m.put(c, 0);
            }
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.codePointAt(i))) {
                    Integer c = m.get(s.charAt(i));
                    m.put(s.charAt(i), ++c);
                }
            }
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.println(c + " : " + m.get(c));
            }
        } catch (NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }
}

