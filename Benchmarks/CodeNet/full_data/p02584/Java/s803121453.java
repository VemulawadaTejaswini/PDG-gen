import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long minx = 0;

        if (X > 0) {
            if ((X / D) >= K) {
                minx = X - (D * K);
            } else {
                if (((X/D) - K) % 2 == 0) {
                    minx = X % D;
                } else {
                    minx = - (X % D - D);
                }
            }
        } else {
            X = - X;
            if ((X / D) >= K) {
                minx = X - (D * K);
            } else {
                if (((X/D) - K) % 2 == 0) {
                    minx = X % D;
                } else {
                    minx = - (X % D - D);
                }
            }
        }
        System.out.println(-minx);
    }
    /*
    private static int[][] nCombination3(int[] list) {
        int count = list.length;
        int num = 0;
        int[][] A = new int[count*(count-1)*(count-2)/6][3];

        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    A[num][0] = list[i];
                    A[num][1] = list[j];
                    A[num][2] = list[k];
                    num++;
                }
            }
        }
        return A;
    }*/
}