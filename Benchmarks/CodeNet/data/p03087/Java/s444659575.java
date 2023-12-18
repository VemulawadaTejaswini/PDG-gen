import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textLength = sc.nextInt();
        int questions = sc.nextInt();
        String text = sc.next();
        final String COUNT_TEXT = "AC";

        for (int i = 0; i < questions; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt();
            String trimedText = text.substring(start, end);
            String replacedText = trimedText.replace(COUNT_TEXT, "");
            System.out.println((trimedText.length() - replacedText.length()) / 2);
        }
    }
}