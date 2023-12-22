import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int x, sum;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        while (x != 0) {
            sum = 0;
            while (x >= 1) {
                sum += x % 10;
                x /= 10;
            }
            System.out.println(sum);
            x = sc.nextInt();
        }
    }
}
