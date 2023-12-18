import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);

        String S = scanner.nextLine();
        String T = scanner.nextLine();

        int gcd = gcd(N, M);
        int pN = N / gcd;
        int pM = M / gcd;

        for (int i = 0; i < gcd; ++i) {
            if (S.charAt(pN * i) != T.charAt(pM * i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(N * M / gcd);
    }

    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}