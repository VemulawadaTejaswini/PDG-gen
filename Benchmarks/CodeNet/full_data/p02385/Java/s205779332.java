import java.util.Scanner;

class Dice {
    int[] dn = new int[6];

    Dice(int[] d) {
        for (int i = 0; i < 6; i++) {
            dn[i] = d[i];
        }
    }

    void turnN() {
        int x = dn[0];
        dn[0] = dn[1];
        dn[1] = dn[5];
        dn[5] = dn[4];
        dn[4] = x;
    }

    void turnS() {
        int x = dn[0];
        dn[0] = dn[4];
        dn[4] = dn[5];
        dn[5] = dn[1];
        dn[1] = x;
    }

    void turnW() {
        int x = dn[0];
        dn[0] = dn[2];
        dn[2] = dn[5];
        dn[5] = dn[3];
        dn[3] = x;
    }

    void turnE() {
        int x = dn[0];
        dn[0] = dn[3];
        dn[3] = dn[5];
        dn[5] = dn[2];
        dn[2] = x;
    }

    static boolean judge(Dice d1, Dice d2) {
        boolean a = true;

        if (d1.dn[1] == d2.dn[2] || d1.dn[1] == d2.dn[3])
            d2.turnW();

        for (int i = 0; i < 3; i++) {
            if (d2.dn[1] == d1.dn[1])
                break;
            d2.turnS();
        }
        if (d2.dn[1] != d1.dn[1])
            a = false;

        for (int i = 0; i < 3; i++) {
            if (d2.dn[0] == d1.dn[0])
                break;
            d2.turnW();
        }
        if (d2.dn[0] != d1.dn[0])
            a = false;

        for (int i = 2; i < 6; i++) {
            a = a && d2.dn[i] == d1.dn[i];
        }

        return a;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        Dice[] dc = new Dice[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                num[j] = sc.nextInt();
            }
            dc[i] = new Dice(num);
        }
        if (Dice.judge(dc[0], dc[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

