import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        long sum = a + (long)Math.pow(a, 2) + (long)Math.pow(a, 3);
        System.out.println(sum);
    }

}