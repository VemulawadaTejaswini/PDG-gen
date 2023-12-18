import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long currentT = sc.nextLong();
        long currentA = sc.nextLong();

        for (int i = 1; i < N; i++) {
            long t = sc.nextLong();
            long a = sc.nextLong();

            long tScale = t / currentT;
            long aScale = a / currentA;
            long scale = 1;
            if (Math.min(tScale, aScale) < 1) {
                scale = Math.max((currentT + t - 1)/ t, (currentA + a - 1)/ a);
            }
            currentT = scale * t;
            currentA = scale * a;
        }
        System.out.println(currentT + currentA);
    }
}