import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textLength = sc.nextInt();
        int questions = sc.nextInt();
        char[] text = sc.next().toCharArray();

        for (int i = 0; i < questions; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            System.out.println(countAC(text, start, end));

        }
    }

    private static int countAC(char[] text, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            if (text[i] == 'A' && text[i + 1] == 'C') {
                result++;
                i++;
            }
        }
        return result;
    }
}