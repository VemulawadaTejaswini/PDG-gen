import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] sCards = { true, true, true, true, true, true, true, true, true, true, true, true, true, };
        boolean[] hCards = { true, true, true, true, true, true, true, true, true, true, true, true, true, };
        boolean[] cCards = { true, true, true, true, true, true, true, true, true, true, true, true, true, };
        boolean[] dCards = { true, true, true, true, true, true, true, true, true, true, true, true, true, };
        StringBuilder sb = new StringBuilder();

        int restCardCnt = in.nextInt();
        while (in.hasNext()) {
            String suit = in.next();
            int number = in.nextInt();

            for (int i = 0; i < restCardCnt; i++) {
                if (suit.equals("S")) {
                    sCards[number - 1] = false;
                } else if (suit.equals("H")) {
                    hCards[number - 1] = false;
                } else if (suit.equals("C")) {
                    cCards[number - 1] = false;
                } else {
                    dCards[number - 1] = false;
                }
            }
        }

        printRestCards("S", sCards, sb);
        printRestCards("H", hCards, sb);
        printRestCards("C", cCards, sb);
        printRestCards("D", dCards, sb);

        System.out.print(sb.toString());
    }

    private static void printRestCards(String suit, boolean[] rest, StringBuilder sb) {
        for (int i = 0; i < rest.length; i++) {
            sb.append(rest[i] ? suit + " " + (i + 1) + "\n" : "");
        }
        return;
    }
}