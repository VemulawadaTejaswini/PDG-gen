import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Card[] cards = new Card[n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char suit = s.charAt(0);
            int value = Integer.parseInt(s.substring(1));

            cards[i] = new Card(suit, value);
        }

        Card[] A = cards.clone();
        BubbleSort(A, n);
        PrintArray(A);
        System.out.println(CheckStableSort(cards, A));

        Card[] B = cards.clone();
        SelectionSort(B, n);
        PrintArray(B);
        System.out.println(CheckStableSort(cards, B));
    }

    static class Card {
        char suit;
        int value;

        Card(char suit, int value) {
            this.suit = suit;
            this.value = value;
        }
    }

    // 配列内の指定された2インデックスの要素を交換する
    static void Swap(Card[] C, int a, int b) {
        Card tmp = new Card(C[a].suit, C[a].value);
        C[a] = C[b];
        C[b] = tmp;
    }

    // バブルソート
    static void BubbleSort(Card[] C, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                if (C[j].value < C[j-1].value)
                    Swap(C, j, j-1);
            }
        }
    }

    // セレクトソート
    static void SelectionSort(Card[] C, int N) {
        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i; j < N; j++) {
                if (C[j].value < C[minj].value)
                    minj = j;
            }
            Swap(C, i, minj);
        }
    }

    // 配列を表示する
    static void PrintArray(Card[] C) {
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i].suit);
            System.out.print(C[i].value);
            if (i != C.length-1)
                System.out.print(" ");
        }
        System.out.println();
    }

    // ソートされた配列が安定かどうか判断する(B:Before, A:After)
    static String CheckStableSort(Card[] B, Card[] A) {
        int indexB = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > 0 && A[i].value != A[i - 1].value)
                indexB = 0;
            for (int j = indexB; j < B.length; j++) {
                if (A[i].value == B[j].value) {
                    if (A[i].suit != B[j].suit) {
                        return "Not stable";
                    } else {
                        indexB = j + 1;
                        break;
                    }
                }
            }
        }

        return "Stable";
    }
}
