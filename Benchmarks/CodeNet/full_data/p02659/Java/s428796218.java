import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();

        long answer = (long) ((a*(b*100))/100);

        System.out.println(answer);
    }
}