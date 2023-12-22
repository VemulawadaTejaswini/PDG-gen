import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line1 = new Scanner(System.in).nextLine();
        String line2 = new Scanner(System.in).nextLine();
        String line3 = new Scanner(System.in).nextLine();
        int a = Integer.parseInt(line1.split(" ")[0]);
        int v = Integer.parseInt(line1.split(" ")[1]);
        int b = Integer.parseInt(line2.split(" ")[0]);
        int w = Integer.parseInt(line2.split(" ")[1]);
        int t = Integer.parseInt(line3);

        for (int i = 0; i < t; i++) {
            int player1 = a + (i * v);
            int player2 = b + (i * w);
            if(player1 == player2) {
                System.out.println("YES");
                System.exit(-1);
            }
        }

        System.out.println("NO");
    }
}