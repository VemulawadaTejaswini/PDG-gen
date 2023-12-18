import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pos = new int[26];
        String in = sc.next();
        for (int i = 0; i < in.length(); i++) {
            pos[in.charAt(i) - 'a'] = i + 1;
        }
        if (in.length() < 26) {
            System.out.print(in);
            for (int i = 0; i < 26; i++) {
                if (pos[i] == 0) {
                    System.out.println((char) (i + 'a'));
                    return;
                }
            }
        }
        for (int i = 25; i >= 0; i--) {
            for (int j = in.charAt(i) - 'a' + 1; j < 26; j++) {
                if (pos[j] > i + 1) {
                    System.out.print(in.substring(0, i));
                    System.out.println((char) (j + 'a'));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
