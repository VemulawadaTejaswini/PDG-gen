import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int M = scanner.nextInt();

       int time = 24 + (24 - M);
       System.out.println(time);
    }
}