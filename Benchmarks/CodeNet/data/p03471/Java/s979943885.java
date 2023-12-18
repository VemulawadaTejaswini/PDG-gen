import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int a=0; a<=N; a++) {
            for (int b=0; b<=N-a; b++) {
                int c = N - a - b;
                int total = a * 10000 + b * 5000 + c * 1000;
                if (total == Y) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}