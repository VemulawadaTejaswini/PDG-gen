import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long num = 1;
        long keta = 1;
        for (int i = 0; i < k; i++) {
            System.out.println(num);
            if (num / keta == 9) {
                keta *= 10;
                num += keta;
            } else {
                num += keta;
            }
        }
        sc.close();
    }
}
