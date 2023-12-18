import java.util.*;

public class Main {
    public static void main(String[] args) {
        test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arrayA = new long[N];
        long[] arrayB = new long[N];

        for (int i = 0; i < N; i++) {
            arrayA[i] = sc.nextLong();
            arrayB[i] = sc.nextLong();
        }

        System.out.println(calc(arrayA, arrayB));
    }

    private static int calc(long[] arrayA, long[] arrayB) {
        int ind = arrayA.length - 1;
        long a, b, inc;
        int count = 0;
        while (ind >= 0) {
            a = arrayA[ind];
            b = arrayB[ind];
            inc = 0;
            if (a < b) {
                inc = b - a;
            } else if (a > b && a % b != 0) {
                long d = a / b;
                inc = b-(a-b*d);
            }
//            System.out.println("Increment :" + inc + " Up to: " + ind);
            incrementTo(arrayA, ind, inc);
//            System.out.println("Increment :" + inc + " Up to: " + ind + "count:" +count);
            count += inc;

//            System.out.println(count);

            ind--;
        }
        return count;
    }

    // Increment array
    private static void incrementTo(long[] array, int ind, long add) {
        if (ind >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = 0; i <= ind; i++) {
            array[i] += add;
        }
    }

    private static void test() {
        assert calc(new long[] {3,2,9}, new long[] {5,7,4}) == 7;
        assert calc(new long[] {3,4,5,2,5,5,9}, new long[] {1,1,9,6,3,8,7}) == 22;
    }
}
