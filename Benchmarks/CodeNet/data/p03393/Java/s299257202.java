import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        String s = sc.next();
        int[] count = charCount(s);
        if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println(-1);
            return;
        }
        String ss = "";
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                ss = Character.toString((char) (i + 97));
                break;
            }
        }
        if (ss.isEmpty()) {
            char z = s.charAt(25);
            for (int i = 24; i >= 0; i--) {
                if (s.charAt(i) != z + 1) {
                    s = s.replace(s.charAt(i), (char) (s.charAt(i) + 1));
                    s = s.substring(0, i + 1);
                    System.out.println(s);
                    return;
                } else {
                    z++;
                }
            }
        } else {
            System.out.println(s + ss);
        }
    }

    private int[] charCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.codePointAt(i) - 97]++;
        }
        return count;
    }
}