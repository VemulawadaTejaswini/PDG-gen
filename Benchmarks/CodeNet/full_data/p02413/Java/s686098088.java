import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        int r = sc.nextInt(), c = sc.nextInt();
 
        int[][] A = new int[r + 1][c + 1];
 
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
 
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += A[i][j];
            }
            A[i][c] = sum;
        }
        for (int j = 0; j <= c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum += A[i][j];
            }
            A[r][j] = sum;
        }
 
        for (int i = 0; i <= r; i++)
            ln(join(A[i], " "));
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
 
    public static String join(int[] array, String separator) {
        StringBuilder str = new StringBuilder(array[0] + "");
        for (int i = 1; i < array.length; i++) {
            str.append(separator).append(array[i] + "");
        }
        return str.toString();
    }
}
