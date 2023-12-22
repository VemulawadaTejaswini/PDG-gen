import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = Long.parseLong(in.nextLine());
        long k = 2;
        while (true) {
            if ((k * (k+1)) % (2 * N) == 0)
                break;
            k += 2;
        }
        System.out.println(k);
    }
}
