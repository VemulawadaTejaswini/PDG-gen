import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputs = input.split("\\s+");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        if (a < b & b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
