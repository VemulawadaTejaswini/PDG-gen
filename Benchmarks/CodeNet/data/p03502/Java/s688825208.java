import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine().replace("\n", "");
        sc.close();

        int total = 0;
        for (int i = 0; i < num.length(); i++) {
            total += Character.getNumericValue(num.charAt(i));
        }

        if (Integer.parseInt(num) % total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
