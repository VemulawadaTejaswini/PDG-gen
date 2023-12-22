import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String num = scanner.next();

            MultipleOfNine target = new MultipleOfNine();
            System.out.println(target.check(num));
        }
    }
}

class MultipleOfNine {

    public String check(String number) {
        String[] nums = number.split("");
        long total = 0;
        for (String num : nums) {
            int parsed = Integer.parseInt(num);
            total += parsed;
        }

        if (total % 9 == 0) {
            return "Yes";
        }
        return "No";
    }

}