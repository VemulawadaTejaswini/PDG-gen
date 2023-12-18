import java.util.Scanner;

public class easy_mod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        String result = ((first * second) % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
