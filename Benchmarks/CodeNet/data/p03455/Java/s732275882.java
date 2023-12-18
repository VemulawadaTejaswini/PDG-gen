import java.util.Scanner;

public class EvenOrOdd {
    public static void EvenOrOdd(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;

        if(c % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        scanner.close();
    }
}