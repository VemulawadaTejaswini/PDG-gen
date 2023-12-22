import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Card[] cards = new Card[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Card.newInstance(input.next());
        }
        Card[] bs = bubbleSort(Arrays.copyOf(cards, N));
        print(bs);
        System.out.println("Stable");
        Card[] ss = selectionSort(Arrays.copyOf(cards, N));
        print(ss);
        System.out.println(compareCards(bs, ss) ? "Stable" : "Not stable");
    }
    
    private Card[] bubbleSort(Card[] cs) {
        for (int i = 0; i < cs.length; i++) {
            for (int j = cs.length - 1; i < j; j--) {
                if (cs[j].getNumber() < cs[j-1].getNumber()) {
                    Card c = cs[j];
                    cs[j] = cs[j-1];
                    cs[j-1] = c;
                }
            }
        }
        return cs;
    }
    
    private Card[] selectionSort(Card[] cs) {
        for (int i = 0; i < cs.length; i++) {
            int mini = i;
            for (int j = i; j < cs.length; j++) {
                if (cs[j].getNumber() < cs[mini].getNumber()) {
                    mini = j;
                }
            }
            Card c = cs[i];
            cs[i] = cs[mini];
            cs[mini] = c;
        }
        return cs;
    }
    
    private boolean compareCards(Card[] xs, Card[] ys) {
        if (xs.length != ys.length) return false;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i].toString().equals(ys[i].toString()) == false) {
                return false;
            }
        }
        return true;
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Card {
        private String mark;
        private int number;
        
        private Card(String str) {
            mark = str.substring(0, 1);
            number = Integer.valueOf(str.substring(1));
        }
        
        public static Card newInstance(String str) {
            return new Card(str);
        }
        
        public int getNumber() {
            return number;
        }
        
        public String getMark() {
            return mark;
        }
        
        @Override
        public String toString() {
            return mark + number;
        }
    }
}