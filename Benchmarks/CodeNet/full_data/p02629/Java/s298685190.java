import java.util.Scanner;

class Main {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        
        int keta = 1;
        long ichi = 0;
        for (; n > 0; keta++) {
            ichi = n;
            n -= Math.pow(26, keta);
            System.out.println(n);
        }
        System.out.println("keta"+keta);

        String name = "";
        for (int i = keta - 1; i > 0; i--) {
            int idx = (int)(ichi % 26);
            name = alphabet[idx] + name;
            ichi /= 26;
        }
        System.out.println(name);
    }
}
