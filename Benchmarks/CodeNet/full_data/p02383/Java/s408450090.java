import java.util.Scanner;

class Dice {
    private int dn[] = new int[6];

    Dice(int d[]) {
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

    int Ans() {
        return dn[0];
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }
        Dice d1 = new Dice(num);
        String com = sc.next();
        for (int i = 0; i < com.length(); i++) {
            switch (com.charAt(i)) {
            case 'S':
                d1.turnS();
                break;
            case 'N':
                d1.turnN();
                break;
            case 'W':
                d1.turnW();
                break;
            case 'E':
                d1.turnE();
                break;
            }
        }
        System.out.println(d1.Ans());
    }
}
