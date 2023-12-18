import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        String s = sc.next();
        if (s.length() < 26) {
            int[] count = charCount(s);
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0) {
                    String ss = Character.toString((char) (i + 97));
                    System.out.println(s + ss);
                    return;
                }
            }
        } else {
            int[] countBack = new int[26];
            char z = s.charAt(25), zz = s.charAt(25);
            countBack[s.codePointAt(25) - 97]++;
            for (int i = 24; i >= 0; i--) {
                if (s.charAt(i) >= z + 1) {
                    z = s.charAt(i);
                    countBack[s.codePointAt(i) - 97]++;
                } else {
                    int[] countForward = charCount(s.substring(0, i + 1));
                    for (int j = s.charAt(i) - 97; j < 26; j++) {
                        if (countForward[j] == 0) {
                            s = s.substring(0,i) + (char)(j+97);
                            System.out.println(s);
                            return;
                        }
                    }
                }
            }
            System.out.println(-1);
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