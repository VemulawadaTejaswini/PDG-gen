import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String str[] = new Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int calc = a * b;
        int length = a * 2 + b * 2;

        System.out.print(calc);
        System.out.print(" ");
        System.out.print(length);                                               

    }   
}