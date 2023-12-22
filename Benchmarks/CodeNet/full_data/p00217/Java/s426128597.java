
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n != 0) {
            int top = 0;
            int longest = 0;
            for (int i = 0; i < n; i++) {

                int kanja = scan.nextInt();

                int d1 = scan.nextInt();
                int d2 = scan.nextInt();
                int kyori;
                kyori = d1 + d2;
                if (i == 0) {
                    longest = kyori;
                    top = kanja;

                } else if (kyori > longest) {
                    longest = kyori;
                    top = kanja;

                }

            }
            System.out.println(top + " " + longest);
            n = scan.nextInt();
        }

    }
}

