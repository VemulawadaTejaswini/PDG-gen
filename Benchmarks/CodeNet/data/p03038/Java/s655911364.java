import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNum = Integer.parseInt(sc.next());
        int calcNum = Integer.parseInt(sc.next());

        int[] cards = new int[cardNum];
        for (int i = 0; i < cardNum; i++) {
            cards[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < calcNum; i++) {
            int chaNum = Integer.parseInt(sc.next());
            int nuint = Integer.parseInt(sc.next());

            for(int j = 0; j < chaNum; j++) {
                int minpos = 0;
                int min = cards[0];
                for (int x = 1; x < cardNum; x++) {
                    if(min > cards[x]) {
                        min = cards[x];
                        minpos = x;
                    }
                }
                if(cards[minpos] < nuint) cards[minpos] = nuint;
            }
        }

        long max = 0;
        for (int i = 0; i < cardNum; i++) {
            max = max + cards[i];
        }
        System.out.println(max);
    }
}