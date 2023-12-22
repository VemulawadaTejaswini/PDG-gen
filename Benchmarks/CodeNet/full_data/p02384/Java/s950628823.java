import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(),
                                       sc.nextInt(), sc.nextInt(), sc.nextInt()});

        int count = sc.nextInt();
        char[] choice = new char[]{'N', 'E', 'S', 'W'};
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt()};
            while (dice.eyes[dice.now[0]] != a[0]) {
                int idx = dice.find(a[0]);
                if (idx == 2 || idx == 4) {
                    dice.move('E');
                } else {
                    dice.move('N');
                }
            }
            while (dice.eyes[dice.now[3]] != a[1]) {
                dice.spin('R');
            }
            System.out.println(dice.eyes[dice.now[2]]);
        }
    }

    static class Dice {

        int[] eyes;
        int[/*TOP N E S W BOT*/] now;

        public Dice(int[] eyes) {
            this.eyes = eyes;
            this.now = new int[]{0, 4, 2, 1, 3, 5};
        }

        int find(int eye) {
            for (int i = 0; i < now.length; i++) {
                if (eyes[now[i]] == eye) {
                    return i;
                }
            }
            return -1; // never comes
        }

        void move(char way) {
            int tmp;
            switch (way) {
                case 'N':
                    tmp = now[0];
                    now[0] = now[3];
                    now[3] = now[5];
                    now[5] = now[1];
                    now[1] = tmp;
                    break;
                case 'E':
                    tmp = now[0];
                    now[0] = now[4];
                    now[4] = now[5];
                    now[5] = now[2];
                    now[2] = tmp;
                    break;
                case 'S':
                    tmp = now[0];
                    now[0] = now[1];
                    now[1] = now[5];
                    now[5] = now[3];
                    now[3] = tmp;
                    break;
                case 'W':
                    tmp = now[0];
                    now[0] = now[2];
                    now[2] = now[5];
                    now[5] = now[4];
                    now[4] = tmp;
                    break;
            }
        }

        void spin(char way) {
            int tmp;
            switch (way) {
                case 'R':
                    tmp = now[1];
                    now[1] = now[4];
                    now[4] = now[3];
                    now[3] = now[2];
                    now[2] = tmp;
                    break;
                case 'L':
                    tmp = now[1];
                    now[1] = now[2];
                    now[2] = now[3];
                    now[3] = now[4];
                    now[4] = tmp;
                    break;
            }
        }
    }
}