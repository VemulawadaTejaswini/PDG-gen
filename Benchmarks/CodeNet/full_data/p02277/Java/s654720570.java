import java.util.*;
import java.awt.geom.Point2D.Double;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Card {
    char    suit;
    int     value;
}

public class Main {
    private static int MAX = 100000;

    public static void main(String[] args) throws Exception {
            // 入力
            Card[]      A = new Card[MAX];
            Card[]      B = new Card[MAX];
            int     n;
//            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//            n = Integer.parseInt(sc.next());
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                Card c = new Card();
/*                c.suit = sc.next().charAt(0);
                c.value = Integer.parseInt(sc.next());
*/
                String[] s = br.readLine().split(" ");
                c.suit = s[0].charAt(0);
                c.value = Integer.parseInt(s[1]);
                A[i] = c;

                Card c2 = new Card();
                c2.suit = c.suit;
                c2.value = c.value;
                B[i] = c2;
            }
//            sc.close();

            // クイックソート
            quickSort(A, 0, n - 1);
            // マージソート
            mergeSort(B, 0, n);

            // マージソートとクイックソートの結果を比べる
            String      s = "Stable";
            for (int i = 0; i < n; i++) {
                if (A[i].suit != B[i].suit) s = "Not stable";
            }

            // 出力
            System.out.println(s);
            for (int i = 0; i < n; i++) {
                System.out.println(A[i].suit + " " + A[i].value);
            }
    }

    static void mergeSort(Card[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    static Card[]       L = new Card[MAX / 2 + 2];
    static Card[]       R = new Card[MAX / 2 + 2];
    static final int    INFTY = 2000000000;
    static void merge(Card[] A, int left, int mid, int right) {
        int     n1 = mid - left;
        int     n2 = right - mid;
        for (int i = 0; i < n1; i++) {
            Card        c = new Card();
            c.suit = A[left + i].suit;
            c.value = A[left + i].value;
            L[i] = c;
        }
        for (int i = 0; i < n2; i++) {
            Card        c = new Card();
            c.suit = A[mid + i].suit;
            c.value = A[mid + i].value;
            R[i] = c;
        }

        Card    temp = new Card();
        temp.suit = 'D';
        temp.value = INFTY;
        L[n1] = temp;
        R[n2] = temp;

        int     i = 0;
        int     j = 0;
        for (int k = left; k < right; k++) {
            if (L[i].value <= R[j].value) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
        }
    }


    /**
     * 
     * @param A
     * @param n Aの長さ
     * @param p ソート対象の部分配列の開始位置
     * @param r ソート対象の部分配列の末尾
     */
    static void quickSort(Card[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    static int partition(Card[] A, int p, int r) {
        int         x = A[r].value;       // 配列の末尾。判定の基準になる
        int         i = p - 1;      // A[r]以下を差す
        Card        temp;
        for (int j = p; j < r; j++) {
            if (A[j].value <= x) {
                i = i + 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }
}

