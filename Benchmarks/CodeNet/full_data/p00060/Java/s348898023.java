import java.util.*;

class Main {

    static void solve (int a1, int a2, int b) {
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) {
            cards.add(i);
        }

        cards.remove(cards.indexOf(a1));
        cards.remove(cards.indexOf(a2));
        cards.remove(cards.indexOf(b));

        int ok = 0;
        for(int i = 0; i < 7; i++) {
            if (cards.get(i) + a1 + a2 <= 20) {
                ok += 1;
            } else {
                break;
            }
        }

        if (ok >= 4) System.out.println("YES");
        else         System.out.println("NO");
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b = sc.nextInt();
            solve(a1, a2, b);
        }

    }
}