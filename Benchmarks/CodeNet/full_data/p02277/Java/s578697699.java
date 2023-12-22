import java.util.Scanner;

class Card {
    char m;
    int n;
    int index;

    Card(char m, int n, int index) {
        this.m = m;
        this.n = n;
        this.index = index;
    }    
}

public class Main {
    private static int partition(Card[] a, int p, int r) {
        int x = a[r].n;
        int i = p - 1;
        for(int j = p; j < r; j++) {
            if(a[j].n <= x) {
                i++;
                Card tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        Card tmp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = tmp;
        return i + 1;
    }

    private static void quickSort(Card[] a, int p, int r) {
        if(p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    private static boolean isStable(Card[]a, int n) {
        for(int i = 0; i < n - 1; i++) {
            if(a[i].n == a[i + 1].n && a[i].index > a[i + 1].index) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        Card[] a = new Card[n];
        for(int i = 0; i < n; i++) {
            char m = sc.next().charAt(0);
            int num = sc.nextInt();
            a[i] = new Card(m, num, i);
        }

        quickSort(a, 0, n - 1);

        if(isStable(a, n)) System.out.println("Stable");
        else System.out.println("Not stable");

        for(int i = 0; i < n; i++) {
            System.out.printf("%c %d\n", a[i].m, a[i].n);
        }

        sc.close();
    }
}

