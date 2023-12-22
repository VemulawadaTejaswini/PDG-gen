import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char[] right = {'y', 'h', 'n', 'u', 'j', 'm', 'i', 'k', 'o', 'l', 'p'};
        char[] left = {'t', 'g', 'b', 'r', 'f', 'v', 'e', 'd', 'c', 'w', 's', 'x', 'q', 'a', 'z'};
        String s = scan.next();
        while (!s.equals("#")) {
            int count = 0;
            boolean side = false;
            for (int i = 0; i < right.length; i++) {
                if (s.charAt(0) == right[i]) {
                    side = true;
                }
            }

            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (side == false) {
                    for (int j = 0; j < right.length; j++) {
                        if (c == right[j]) {
                            side = true;
                            count += 1;
                        }
                    }
                } else {
                    for (int j = 0; j < left.length; j++) {
                        if (c == left[j]) {
                            side = false;
                            count += 1;
                        }
                    }
                }
            }
            System.out.println(count);
            s = scan.next();
        }
     }
}