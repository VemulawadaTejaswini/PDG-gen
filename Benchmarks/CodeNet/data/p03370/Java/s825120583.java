import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt();
        int m[] = new int[n];
        int sum = 0;
        int min = 1000;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            sum += m[i];
            min = Math.min(min, m[i]);
        }
        System.out.println(n + (x - sum) / min);
    }
}