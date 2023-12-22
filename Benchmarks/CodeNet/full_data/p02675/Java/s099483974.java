import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        int lastIndex = number.length() - 1;
        char lastChar = number.charAt(lastIndex);

        String ans = "";
        if (lastChar == 2 || lastChar == 4 || lastChar == 5 || lastChar == 7 || lastChar == 9) {
            ans = "hon";
        } else if (lastChar == 0 || lastChar == 1 || lastChar == 6 || lastChar == 8) {
            ans = "pon";
        } else  {
            ans = "bon";
        }
        System.out.println(ans);
    }
}
