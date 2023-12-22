import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[26];

        while (sc.hasNext()) {
            String input = sc.next();
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if ((j+'a') == input.charAt(i)) {
                        cnt[j] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a'+i) + " : " + cnt[i]);
        }
    }
}
