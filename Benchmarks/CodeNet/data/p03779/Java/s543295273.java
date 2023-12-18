import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum >= x) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }

}
