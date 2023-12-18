import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.print(10*num1 + num2 + num3);
        } else if (num2 > num1 && num2 > num3) {
                        System.out.print(10*num2 + num1 + num3);

        } else if (num3 > num1 && num3 > num2) {
                        System.out.print(10*num3 + num2 + num1);

        }


    }
}