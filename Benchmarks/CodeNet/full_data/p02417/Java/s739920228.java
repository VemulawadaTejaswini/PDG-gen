import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int alpha[] = new int[26];

        while (scanner.hasNext())
            sb.append(scanner.nextLine());

        String a = sb.toString();
        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            if ((97 <= a.charAt(i) && a.charAt(i) <= 122) == false)
                continue;

            alpha[a.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.printf("%c : %d\n", (char) (i + 97), alpha[i]);
        }
    }
}
