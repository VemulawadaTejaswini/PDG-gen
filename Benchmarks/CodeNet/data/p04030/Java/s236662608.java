import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = s.length - 1, c = 0; i >= 0; i--) {
            if (s[i] == 'B') {
                c++;
            } else if (0 < c) {
                c--;
            } else {
                list.add(0, String.valueOf(s[i]));
            }
        }
        System.out.println(String.join("", list));
    }
}