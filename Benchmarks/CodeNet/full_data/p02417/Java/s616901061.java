import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        int ct[][] = new int[26][2];

        for (int i = 0; i < 26; i++) {
            ct[i][0] = 97 + i;
            ct[i][1] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (str.charAt(i) == (char) ct[j][0]) {
                    ct[j][1]++;
                }

            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println((char) ct[i][0] + " : " + ct[i][1]);
        }
    }
}