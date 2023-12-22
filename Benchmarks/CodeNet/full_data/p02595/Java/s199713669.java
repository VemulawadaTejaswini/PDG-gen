import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), D = scanner.nextInt(),ans=0;
        for (int i = 0; i < N; i++) {
            long a = scanner.nextInt(), b = scanner.nextInt();
            double dist = Math.sqrt(a*a+b*b);
            if (dist<=D)ans++;
        }
        System.out.println(ans);
    }

}
