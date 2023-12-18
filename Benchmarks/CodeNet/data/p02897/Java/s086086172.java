import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        float mod = n % 2;
        System.out.println((n/2+mod)/n);
    }
}