import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] bool = new boolean[s.length()];
        for (int i = 0; i < bool.length; i++) {
            if (s.charAt(i) == '0') {
                bool[i] = false;
            } else {
                bool[i] = true;
            }
        }
        int counter = 0;
        for (int i = 1; i < bool.length - 1; i++) {
            boolean isChanged = true;
            if (bool[i - 1] == bool[i] && bool[i] == bool[i + 1]) {
                bool[i] = !bool[i];
            } else if (bool[i - 1] == bool[i] && bool[i] != bool[i + 1]) {
                bool[i - 1] = !bool[i - 1];
            } else if (bool[i - 1] != bool[i] && bool[i] == bool[i + 1]) {
                bool[i + 1] = !bool[i + 1];
            } else {
                isChanged = false;
            }
            if (isChanged) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}