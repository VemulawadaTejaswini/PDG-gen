import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println((b - a) * (b - a + 1) / 2 - b);
        long sum = 0;
        for (long i = 1; ; i++) {
            sum += i;
            if(sum >= a) {
                break;
            }
        }
        System.out.println(sum -a);
    }
}