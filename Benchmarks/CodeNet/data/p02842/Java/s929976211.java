import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();
        if ((n / 1.08 % 1)!= 0.0) {
            System.out.println(":(");
        } else {
            System.out.println((int) (n / 1.08));
        }

        System.out.println();
    }
}

