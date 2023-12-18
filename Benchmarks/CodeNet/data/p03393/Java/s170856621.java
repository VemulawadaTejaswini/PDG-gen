import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        String atoz = "abcdefghijklmnopqrstuvwxyz";

        String str = sc.nextLine();
        for (String s : str.split("")) {
            atoz = atoz.replace(s, "");
        }

        if (atoz.length() != 0) {
            System.out.println(str + atoz.charAt(0));
            return;
        } else {
            int max = -1;
            char maxc = ' ';
            for (int i = 25; i >= 0; i--) {
                char tmp = str.charAt(i);
                for (int j = i - 1; j >= 0; j--) {
                    if (tmp > str.charAt(j)) {
                        if (max < j) {
                            max = j;
                            maxc = tmp;
                        }
                    }
                }
            }

            if (max != -1) {
                System.out.println(str.substring(0, max) + maxc);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
