import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        // iは分母
        for (int i = 1; i < k + 1; i++) {
            // 足してiとなる最小値を出す
            long left = i / 9;
            long amari = i % 9;
            if (amari != 0)
                System.out.print(amari);
            for (int j = 0; j < left; j++) {
                System.out.print(9);
            }
            System.out.println("");
        }
        sc.close();
    }
}
