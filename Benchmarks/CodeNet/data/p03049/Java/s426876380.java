import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
        }
        long A =  Arrays.stream(words).filter(s -> !s.startsWith("B") &&  s.endsWith("A")).count();
        long B =  Arrays.stream(words).filter(s ->  s.startsWith("B") && !s.endsWith("A")).count();
        long BA = Arrays.stream(words).filter(s ->  s.startsWith("B") &&  s.endsWith("A")).count();
        long containsAB = Arrays.stream(words).filter(s -> s.contains("AB")).count();

        long min = Math.min(A + BA, B + BA);

        if (A == 0 && B == 0) {
            System.out.println(containsAB + BA - 1);
        } else {
            System.out.println(containsAB + min);
        }
    }
}
