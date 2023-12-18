import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            StringBuilder result = new StringBuilder(S.length());
            IntStream.iterate(0, i -> i < S.length(), i -> ++i).forEach(i -> result.append("x"));

            System.out.println(result);
        }
    }
}