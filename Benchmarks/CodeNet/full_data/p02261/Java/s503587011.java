import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static class Card {
        public String type;
        public int num;

        public Card(String cardString) {
            type = cardString.substring(0, 1);
            num = Integer.parseInt(cardString.substring(1, 2));
        }
        
        public String toString() {
            return type + num;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = readInt(r);
        String[] numStrings = r.readLine().split(" ");
        Card[] A1 = new Card[N];
        Card[] A2 = new Card[N];
        for (int i = 0;i < N;i++) {
            A1[i] = new Card(numStrings[i]);
            A2[i] = new Card(numStrings[i]);
        }
        bubbleSort(A1, N);
        selectionSort(A2, N);
    }
    
    public static void bubbleSort(Card[] A, int N) {
        boolean stable = true;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = N - 1;j >= 1;j--) {
                if (A[j].num < A[j - 1].num) {
                    stable &= swapInt(A, j, j - 1);
                    flag = true;
                }
            }
        }
        System.out.println(dump(A, N));
        System.out.println(stable ? "Stable" : "Not stable");
    }
    
    public static void selectionSort(Card[] A, int N) {
        boolean stable = true;
        for (int i = 0;i < N;i++) {
            int minj = i;
            for (int j = i;j < N;j++) {
                if (A[j].num < A[minj].num) {
                    minj = j;
                }
            }
            //if (A[i].num != A[minj].num) {
                stable &= swapInt(A, i, minj);
            //}
        }
        System.out.println(dump(A, N));
        System.out.println(stable ? "Stable" : "Not stable");
    }
    
    // Stable: true
    // Unstable: false
    public static boolean swapInt(Card[] A, int j, int k) {
        Card v = A[j];
        A[j] = A[k];
        A[k] = v;

        int min = Math.min(j, k);
        int max = Math.max(j, k);
        for (int i = min + 1;i < max;i++) {
            if (A[j].num == A[i].num || A[k].num == A[i].num || A[j].num == A[k].num) {
                return false;
            }
        }
        return true;
    }
    
    public static String dump(Card[] A, int N) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < N;i++) {
            if (i != 0) {
                builder.append(" ");
            }
            builder.append(A[i]);
        }
        return builder.toString();
    }
    
    public static int readInt(BufferedReader r) throws Exception {
        return Integer.parseInt(r.readLine());
    }
}