import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int count = 0;
        int sum = 0;
        n = input.nextInt();
        System.out.print("The answer is ");
        for (int i = 1; i <= n; i++) {
            System.out.print(count + " + ");
            sum = sum + count;
        }
        System.out.printf(" = %d\n", sum);
    }
}
