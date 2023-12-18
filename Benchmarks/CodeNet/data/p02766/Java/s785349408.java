import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int num = Integer.parseInt(numbers[0]);
        int base = Integer.parseInt(numbers[1]);

        System.out.println((int) Math.ceil(Math.log((double) num)/Math.log(base)));
    }

}