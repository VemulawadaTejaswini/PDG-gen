import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextInt();
        long num2 = scanner.nextInt();
        long num3 = scanner.nextInt();

        if (Math.sqrt(num1) +Math.sqrt(num2) < Math.sqrt(num3)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}