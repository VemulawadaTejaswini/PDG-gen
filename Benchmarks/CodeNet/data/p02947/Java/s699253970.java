import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<String> s = new ArrayList<>();

        int result = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < s.size(); j++) {
                if (isSame(input, s.get(j))) {
                    result++;
                }
            }
            s.add(input);
        }

        System.out.println(result);
    }

    public static boolean isSame(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256]; //文字コードの仮定;

        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}