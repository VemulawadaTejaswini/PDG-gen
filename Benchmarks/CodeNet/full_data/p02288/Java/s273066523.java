

import java.util.Scanner;

public class Main {
    static int MAX = 2000000;
    static int H;
    static int[] A = new int[MAX+1];

    static void maxHeapify(int i) {
        int l, r, largest;
        l = 2 * i;
        r = 2 * i + 1;

        // 左の子、自分、右の子で値が最大のノードを選ぶ
        if(l <= H && A[l] > A[i]) largest = l;
        else largest = i;
        if(r <= H && A[r] > A[largest]) largest = r;

        if(largest != i) {
            int tmp = A[i];
            A[i] = A[largest];
            A[largest] = tmp;
            maxHeapify(largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        for(int i = 1; i <= H; i++) A[i] = sc.nextInt();

        for(int i = H / 2; i >= 1; i--) maxHeapify(i);

        for(int i = 1; i <= H; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println();
    }
}

