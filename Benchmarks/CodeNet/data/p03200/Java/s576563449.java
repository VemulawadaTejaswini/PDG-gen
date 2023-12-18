import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] S = in.next().toCharArray();
        int count = 0; int answer = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == 'W') {
                answer += i - count;
                count++;
            }
        }
        System.out.println(answer);
    }
}
