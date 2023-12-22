import java.util.*;

public class StableSort {

    static class Card{
        final String key;
        final int value;

        Card(String k, int v){
            key = k;
            value = v;
        }
        @Override
        public String toString() {
            return key + value;
        }
    }

    private static Card[] bubbleSort(Card[] C){
        int n = C.length;

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--)
                if(C[j].value < C[j-1].value){
                    // swap
                    Card temp = C[j];
                    C[j] = C[j-1];
                    C[j-1] = temp;
                }
        }
        return C;
    }

    private static Card[] selectionSort(Card[] C){
        int n = C.length;

        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i; j < n; j++)
                if (C[j].value < C[mini].value)
                    mini = j;
            // swap
            if(mini != i) {
                Card temp = C[i];
                C[i] = C[mini];
                C[mini] = temp;
            }
        }
        return C;
    }


    private static boolean isStabele(Card[] a, Card[] b){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].key != b[i].key)
                return false;
        }
        return true;
    }


    // print the list of cards
    private static void print(Card[] cards){
        int n = cards.length;
        for (int i = 0; i < n - 1; i++)
            System.out.print(cards[i].toString() + " ");
        System.out.print(cards[n-1].toString());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Card[] cards = new Card[n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            cards[i] = new Card(s.substring(0,1),Integer.parseInt(s.substring(1)));
        }


        Card[] bubble = bubbleSort(cards);
        Card[] selection = selectionSort(cards);
        print(bubble);
        System.out.println("\nStable");
        print(selection);
        if (isStabele(bubble,selection)) System.out.println("\nStable");
        else System.out.println("\nNot stable");

    }
}

