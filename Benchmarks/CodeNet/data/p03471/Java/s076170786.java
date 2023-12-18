import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N + 1; i++) {
            sum += 10000 * i;
            for (int j = 0; j < N + 1; j++) {  
                sum += 5000 * j;
                int z = N - i - j;
                sum += 1000 * z;
                if (sum == Y) System.out.println(" " + i + " " + j + " " + z);
                else sum = 0;
            }
        }
        System.out.println(" " + -1 + " " + -1 + " " + -1);
    }
}