import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[][] cards = new boolean[4][13];
        int n = scan.nextInt();

        if (n == 52) return;
        while (n != 0) {
            char image = scan.next().charAt(0);
            int num = scan.nextInt() - 1;

            switch (image) {
                case 'S':
                    cards[0][num] = true;
                    break;
                case 'H':
                    cards[1][num] = true;
                    break;
                case 'C':
                    cards[2][num] = true;
                    break;
                case 'D':
                    cards[3][num] = true;
                    break;
            }
            n--;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (cards[i][j] == false) {
                    switch (i) {
                        case 0:
                            System.out.println("S " + (j + 1));
                            break;
                        case 1:
                            System.out.println("H " + (j + 1));
                            break;
                        case 2:
                            System.out.println("C " + (j + 1));
                            break;
                        case 3:
                            System.out.println("D " + (j + 1));
                            break;
                    }
                }
            }
        }
    }

}