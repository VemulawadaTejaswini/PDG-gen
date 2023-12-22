import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] spade = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] heart = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] club = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] diamond = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false};
        for (int i = 0; i < n; i++) {
            String symbol = sc.next();
            int num = sc.nextInt();
            switch (symbol) {
                case "S":
                    spade[num - 1] = true;
                    break;
                case "H":
                    heart[num - 1] = true;
                    break;
                case "C":
                    club[num - 1] = true;
                    break;
                case "D":
                    diamond[num - 1] = true;
                    break;
            }
        }
        print(spade, "S");
        print(heart, "H");
        print(club, "C");
        print(diamond, "D");
    }

    public static void print(boolean[] mark, String symbol) {
        for (int i = 0; i < 13; i++) {
            if (!mark[i]) System.out.println(String.format("%s %d", symbol, i + 1));
        }
    }
}

