import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println((int)(Math.ceil(Math.pow(1.05, (new Scanner("5")).nextInt()) * 10) * 10000));
    }
}