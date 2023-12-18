import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();
        numbers[2] = in.nextInt();
        Arrays.sort(numbers);
        System.out.println((int) Math.pow(2, in.nextInt()) * numbers[2] + numbers[0] + numbers[1]);
        in.close();
    }
}