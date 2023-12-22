import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            String ans = "";
            int len = line.length();
            for (int i = 0; i < len ; i++) {
                char ch = line.charAt(i);
                if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                } else {
                    ch = Character.toLowerCase(ch);
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
