import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] list = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < list.length ; i++) {
            if (s.equals(list[i])) {
                System.out.println(list[i + 1]);
                return;
            }
        }
    }
}