import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int min = Math.abs(a + b - n);
        int max = Math.abs(a - b);

        if(min < 0) {
            min = 0;
        }

        System.out.println(String.format("%d %d", max, min));
    }
}