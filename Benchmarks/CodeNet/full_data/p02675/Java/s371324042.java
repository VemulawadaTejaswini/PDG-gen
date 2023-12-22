import java.util.Scanner;

public class Main {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int digit;

        digit = n % 10;

        if (digit == 2 | digit == 4 | digit == 5 | digit == 7 | digit == 9){
            return "hon";

        } else if (digit == 0 | digit == 1 | digit == 6 | digit == 8){
            return "pon";

        } else if (digit == 3){
            return "bon";
        }

        return null;
    }

}