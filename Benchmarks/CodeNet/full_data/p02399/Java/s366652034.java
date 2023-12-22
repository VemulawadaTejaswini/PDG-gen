import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();

        int intg = (int) a / b;
        int remainder = (int) a % b;
        double number = (double) a / b;

        System.out.print(intg + " " + remainder + " ");
        System.out.printf("%f", number);
    }
}

