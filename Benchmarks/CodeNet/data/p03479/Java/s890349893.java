import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int i = 1;
        while (a <= b/2) {
            a *= 2;
            i++;
        }
        System.out.println(i);
    }
}
