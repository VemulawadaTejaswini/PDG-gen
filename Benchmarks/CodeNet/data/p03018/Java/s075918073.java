import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        int len = s.length - 2;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') {
                count++;

                s[i] = 'B';
                s[i + 1] = 'C';
                s[i + 2] = 'A';

                if (i > 1) i -= 2;
            }
        }

        System.out.println(count);
    }
}