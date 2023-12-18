import java.util.Scanner;

/**
 * ABC044B
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        sc.close();

        int[] moji = new int['z' - 'a' + 1];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            moji[c - 'a']++;
        }

        boolean flag = true;
        for (int i = 0; i < moji.length; i++) {
            if (moji[i] % 2 != 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}