import java.util.*;

class Main {

    static void solve (String line) {
        String[] cardsString = line.split(",");
        ArrayList<Integer> cards = new ArrayList<Integer>(5);
        for(int i = 0; i < 5; i++) {
            cards.add(Integer.parseInt(cardsString[i]));
        }

        Collections.sort(cards);

        if (cards.get(0) == cards.get(1)) {
            if (cards.get(1) == cards.get(2) && cards.get(2) == cards.get(3)) {
                System.out.println("four card");
                return;
            } else if (cards.get(1) == cards.get(2) || (cards.get(2) == cards.get(3) && cards.get(3) == cards.get(4))) {
                System.out.println("full house");
                return;
            }
        }

        if (cards.get(1) == cards.get(2) && cards.get(2) == cards.get(3) && cards.get(3) == cards.get(4) ) {
            System.out.println("four card");
            return;
        }

        if (cards.get(1) == cards.get(0) + 1 && cards.get(2) == cards.get(1) + 1 && cards.get(3) == cards.get(2) + 1 && cards.get(4) == cards.get(3) + 1) {
            System.out.println("straight");
            return;
        }
        if (cards.get(0) == 1 && cards.get(1) == 10 && cards.get(2) == 11 && cards.get(3) == 12 && cards.get(4) == 13) {
            System.out.println("straight");
            return;
        }

        if ( (cards.get(0) == cards.get(1) && cards.get(1) == cards.get(2)) || (cards.get(1) == cards.get(2) && cards.get(2) == cards.get(3)) || (cards.get(2) == cards.get(3) && cards.get(3) == cards.get(4)) ) {
            System.out.println("three card");
            return;
        }

        if ( (cards.get(0) == cards.get(1) && cards.get(2) == cards.get(3)) || (cards.get(0) == cards.get(1) && cards.get(3) == cards.get(4)) || (cards.get(1) == cards.get(2) || cards.get(3) == cards.get(4)) ) {
            System.out.println("two pair");
            return;
        }

        if ( cards.get(0) == cards.get(1) || cards.get(1) == cards.get(2) || cards.get(2) == cards.get(3) || cards.get(3) == cards.get(4) ) {
            System.out.println("one pair");
            return;
        }

        System.out.println("null");
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            solve(sc.nextLine());
        }

    }
}