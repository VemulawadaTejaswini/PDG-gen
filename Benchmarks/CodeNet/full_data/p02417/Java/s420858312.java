import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int[] cnt = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char a = 'a';
            char c = string.charAt(i);
            c = Character.toLowerCase(c);

            for (int j = 0; j < cnt.length; j++) {
                if (a == c) cnt[j]++;
                a++;
            }
        }

        char ac = 'a';
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(ac++ + " : " + cnt[i]);
        }
    }
}