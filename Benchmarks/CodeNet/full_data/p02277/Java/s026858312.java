import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {
    static class Cards {
        char suit;
        int number;

        public Cards(char suit, int number) {
            this.suit = suit;
            this.number = number;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Cards[] cards = new Cards[n];
        Cards[] cards2 = new Cards[n];
        for (int i = 0; i < n; i++) {
            String[] split = bf.readLine().split(" ");
            Cards car = new Cards(split[0].charAt(0), Integer.parseInt(split[1]));
            cards[i] = car;
            cards2[i] = car;
        }
        mergeSort(cards2, 0, n );
        StringBuilder sb = new StringBuilder();
        quickSort(cards, 0, n-1);
        boolean kk = true;
        for (int i = 0; i < n; i++) {
            if (kk) {
                if (cards2[i].suit != cards[i].suit) {
                    sb.insert(0, "Not stable\n");
                    kk = false;
                }

            }
            sb.append(cards[i].suit + " " + cards[i].number + "\n");
        }
        if (kk) sb.insert(0, "Stable\n");
        System.out.print(sb.toString());
    }

    private static void mergeSort(Cards[] cards2, int a, int b) {
        if (a + 1 < b) {
            int mid = (a + b) / 2;
            mergeSort(cards2, a, mid);
            mergeSort(cards2, mid, b);
            merge(cards2, a, mid, b);
        }
    }

    private static void merge(Cards[] cards2, int a, int mid, int b) {
        int n1 = mid - a;
        int n2 = b - mid;
        Cards l[] = new Cards[n1 + 1];
        Cards r[] = new Cards[n2 + 1];
        for (int i = 0; i < n1; i++) {
            l[i] = cards2[a + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = cards2[mid + i];
        }
        l[n1] = new Cards('A', Integer.MAX_VALUE);
        r[n2] = new Cards('A', Integer.MAX_VALUE);
        int m = 0, n = 0;
        for (int k = a; k < b; k++) {
            if (l[n].number < r[m].number) {
                cards2[k] = l[n];
                n++;
            } else {
                cards2[k] = r[m];
                m++;
            }
        }
    }

    private static void quickSort(Cards[] cards, int a, int b) {
        if (a < b) {
            int mid = partition(cards, a, b);
            quickSort(cards, a, mid-1);
            quickSort(cards, mid+1, b);
        }
    }

    private static int partition(Cards[] cards, int a, int b) {
        int x = cards[b].number;
        int n = a - 1;//记录小的区域
       // int m = b;//记录大的区域
        for (int j = a; j < b; j++) {
            if (cards[j].number <= x) {
                n++;
                exchange(cards, n, j);
            }
        }
        exchange(cards, n + 1, b);
        return n+1;
    }

    private static void exchange(Cards[] a, int i, int j) {
        Cards tep = a[j];
        a[j] = a[i];
        a[i] = tep;
    }

}
