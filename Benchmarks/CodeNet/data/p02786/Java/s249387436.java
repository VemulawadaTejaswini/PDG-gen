import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();

        long factorialCount = 0;
        boolean isDividable = true;
        while (isDividable) {
            h = h / 2;
            factorialCount += 1;
            if (h == 0) isDividable = false;
        }

        long ans = 1;
        int count = 0;
        while (count < factorialCount) {
            ans *= 2;
            count++;
        }

        System.out.println(ans - 1);
    }
}