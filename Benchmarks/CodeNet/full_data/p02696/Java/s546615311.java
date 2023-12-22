import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong(), n = in.nextLong();
        if (b > n)
            System.out.println(a * n / b - a * (n / b));
        else {
            long i = n / b, x = i * b - 1;
            System.out.println(Math.max(a * n / b - a * (n / b), a * x / b - a * (x / b)));
        }
    }

}
