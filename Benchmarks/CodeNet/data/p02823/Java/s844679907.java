import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong() - 1;
        long B = scanner.nextLong() - 1;
        long d = Math.abs(A - B);
        if (d % 2 == 0) {
            System.out.println(d / 2);
        } else {
            long e = Math.min(A, N - B - 1);
            System.out.println(e + (d - 1) / 2 + 1);
        }
    }
}