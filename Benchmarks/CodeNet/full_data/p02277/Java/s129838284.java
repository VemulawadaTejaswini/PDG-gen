import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n, x;
    static Card[] A;
    static boolean stable = true;

    public static void main(String[] args) {
        read();
        quickSort(A, 0, n - 1);

        String strStable = stable ? "stable" : "Not stable";
        System.out.println(strStable);

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }

    static void quickSort(Card[] A, int p, int r) {
        if(p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    static int partition(Card[] A, int p, int r) {
        x = A[r].n;
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j].n <= x) {
                i++;

                if (A[i].p == A[j].p) {
                    stable = false;
                }

                Card tmp = A[j]; A[j] = A[i]; A[i] = tmp;
            }
        }
        Card tmp = A[i + 1]; A[i + 1] = A[r]; A[r] = tmp;

        return i + 1;
    }

    static void read() {
        n = sc.nextInt();
        A = new Card[n];
        for (int i = 0; i < n; i++) {
            char p = sc.next().toCharArray()[0];
            int n = sc.nextInt();
            A[i] = new Card(p, n);
        }
    }
}

class Card {
    char p;
    int n;

    public Card(char p, int n) {
        this.p = p;
        this.n = n;
    }

    @Override
    public String toString() {
        return String.format("%c %d", this.p, this.n);
    }
}