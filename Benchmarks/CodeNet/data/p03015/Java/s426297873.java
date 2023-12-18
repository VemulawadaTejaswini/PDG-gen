import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String L = sc.next();
        int dec = Integer.parseInt(L, 2);
        sc.close();
        int count = 0;
        for (int i = 0; i <= dec; i++) {
            for (int j = 0; j <= dec; j++) {
                if (isTarget(i, j, dec)) count++;
            }
        }
        System.out.println((int)(count % (Math.pow(10, 9) + 7)));
    }

    private static boolean isTarget(int a, int b, int dec) {
        if (a + b > dec) return false;
        int xor = a ^ b;
        if (a + b == xor) return true;
        return false;
    }
}
