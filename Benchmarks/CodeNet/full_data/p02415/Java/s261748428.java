import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            String str;

            if (Character.isLowerCase(c)) {
                str = Character.toString(c).toUpperCase();
            } else if (Character.isUpperCase(c)) {
                str = Character.toString(c).toLowerCase();
            } else {
                str = Character.toString(c);
            }

            System.out.print(str);
        }
        System.out.println();

        sc.close();
    }
}
