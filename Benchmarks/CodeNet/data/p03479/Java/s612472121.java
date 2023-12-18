import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long count = 0;
        while (y >= x) {
            count++;
            x = x << 1;
        }
        System.out.println(count);
        sc.close();
    }
}
