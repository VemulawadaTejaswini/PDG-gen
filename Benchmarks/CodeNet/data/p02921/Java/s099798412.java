import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] S = scanner.next().toCharArray();
        char[] T = scanner.next().toCharArray();

        int count = 0;
        if (S[0] == T[0]) count++;
        if (S[1] == T[1]) count++;
        if (S[2] == T[2]) count++;
        System.out.println(count);
    }
}
