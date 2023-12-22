import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        Dice dice = new Dice(a, b, c, d, e, f);

        String cmd = sc.next();

        for (int i = 0; i < cmd.length(); i++) {
            switch (cmd.charAt(i)) {
            case 'N': dice = dice.rollToN(); break;
            case 'S': dice = dice.rollToS(); break;
            case 'W': dice = dice.rollToW(); break;
            case 'E': dice = dice.rollToE(); break;
            }
        }

        System.out.println(dice.getTop());
    }

    private static class Dice {
        private int t;
        private int s;
        private int e;
        private int w;
        private int n;
        private int b;

        public Dice() {
            this(1, 2, 3, 4, 5, 6);
        }
        public Dice(int t, int s, int e, int w, int n, int b) {
            this.t = t;
            this.s = s;
            this.e = e;
            this.w = w;
            this.n = n;
            this.b = b;
        }
        public Dice rollToN() {
            return new Dice(s, b, e, w, t, n);
        }
        public Dice rollToS() {
            return new Dice(n, t, e, w, b, s);
        }
        public Dice rollToW() {
            return new Dice(e, s, b, t, n, w);
        }
        public Dice rollToE() {
            return new Dice(w, s, t, b, n, e);
        }
        public int getTop() {
            return t;
        }
    }
}

