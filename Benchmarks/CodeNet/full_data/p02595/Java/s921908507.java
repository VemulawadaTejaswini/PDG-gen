import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.print("(java.version):");
        System.out.println(System.getProperty("java.version"));

        System.out.print("(os.name):");
        System.out.println(System.getProperty("os.name"));

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long D = scanner.nextLong();
        long D2 = D * D;

        long[] X = new long[N];
        long[] Y = new long[N];

        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextLong();
            Y[i] = scanner.nextLong();
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (X[i]*X[i] + Y[i]*Y[i] <= D2) {
                result++;
            }
        }

        System.out.println(result);
    }

}
