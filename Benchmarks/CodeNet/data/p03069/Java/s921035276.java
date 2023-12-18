import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] charArray = S.toCharArray();
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
           if (charArray[i] == '#' && charArray[i + 1] == '.') {
               charArray[i + 1] = '#';
               count++;
           }
        }
        System.out.println(count);
    }
}
