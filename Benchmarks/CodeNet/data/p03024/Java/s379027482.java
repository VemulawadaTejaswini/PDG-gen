import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] c = str.toCharArray();

        int count = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'o') {
                count++;
            }
        }

        if (count + 15 - c.length >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}