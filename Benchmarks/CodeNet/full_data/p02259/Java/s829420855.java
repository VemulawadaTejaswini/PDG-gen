import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br.readLine());
        int[] list = createListInt(br.readLine());
        bubbleSort(list.clone(), n);
    }

    static void checkStable(Card[] list1, Card[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i].serialN != list2[i].serialN) {
                System.out.println("Not stable");
                return;
            }
        }
        System.out.println("Stable");
    }

    static void bubbleSort(int[] list, int n) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; i--) {
                if (list[i] < list[i - 1]) {
                    swap(list, i, i - 1);
                    count++;
                    flag = true;
                }
            }
        }
        print(list);
        System.out.println(count);
    }

    private static void print(int[] list) {
        int n = list.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(list[i]);
        }
        System.out.println(String.join(" ", str));
    }

    static void swap(Card[] list, int a, int b) {
        Card temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}

class Card {
    static int n = 0;
    int serialN;
    char suit;
    int rank;

    Card(char suit, int rank) {
        serialN = n++;
        this.suit = suit;
        this.rank = rank;
    }

}