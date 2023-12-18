import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        S = S.replaceAll("BC", "D");
        char[] data = S.toCharArray();
        int length = data.length;
        long answer = 0;
        int current = 0;
        while (current + 1 < length) {
            if (data[current] != 'A') {
                current += 1;
                continue;
            }
            if (data[current + 1] == 'D') {
                data[current] = 'D';
                data[current + 1] = 'A';
                answer += 1;
                if (1 <= current && data[current - 1] == 'A') {
                    current -= 1;
                } else {
                    current += 1;
                }
                continue;
            }
            current += 1;
        }

        System.out.println(answer);
    }
}
