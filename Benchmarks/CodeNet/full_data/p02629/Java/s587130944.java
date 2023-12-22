import java.util.Scanner;

class Main {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long tmp = n;
        int keta = 1;
        while (true) {
            tmp -= Math.pow(26, keta);
            if (tmp <= 0) {
                break;
            }
            keta++;
        }

        String name = "";
        for (; keta > 0; keta--) {
            int idx = (int)((n - 1) % 26);
            name = alphabet[idx] + name;
            n = (n - 1) / 26;
        }

        System.out.println(name);
    }
}
