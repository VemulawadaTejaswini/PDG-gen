import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        String str = in.next();
        int red = 0;
        for (int i = 0; i < n; i++) {
            red += str.charAt(i) == 'R' ? 1 : 0;
        }
        int answer = 0;
        for (int i = 0; i < red; i++) {
            answer += str.charAt(i) == 'W' ? 1 : 0;
        }
        System.out.println(answer);
    }
}