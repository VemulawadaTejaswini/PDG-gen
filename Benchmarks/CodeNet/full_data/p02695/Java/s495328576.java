import java.util.Scanner;

public class Main {
    static int M;
    static int[][] pair;
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        int Q = sc.nextInt();
        pair = new int[Q][4];
        for (int i = 0; i < pair.length; i++) {
            for (int j = 0; j < 4; j++) {
                pair[i][j] = sc.nextInt();
            }
        }
        int[] A = new int[N];
        numArray(A, 0, 1);
        System.out.println(max);
        sc.close();
    }

    static void numArray(int[] array, int index, int pre) {
        if (index == array.length) {
            max = Math.max(max, res(array, pair));
            return;
        }
        for (array[index] = pre; array[index] <= M; array[index]++) {
            numArray(array, index + 1, array[index]);   
        }
    }

    static int res(int[] array, int[][] abcd) {
        int sum = 0;
        for (int i = 0; i < abcd.length; i++) {
            if (array[abcd[i][1] - 1] - array[abcd[i][0] - 1] == abcd[i][2]) {
                sum += abcd[i][3];
            }    
        }
        return sum;
    }
}