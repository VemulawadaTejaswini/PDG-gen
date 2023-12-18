import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if((a * b) % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (InputMismatchException e) { 
              System.out.println("整数を入力してください。");
        }
    }
}