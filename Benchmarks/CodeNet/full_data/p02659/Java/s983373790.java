import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        float b = sc.nextFloat();
        double operation = a*b;
        System.out.println(a);
        System.out.println((long) operation);
    }
}
