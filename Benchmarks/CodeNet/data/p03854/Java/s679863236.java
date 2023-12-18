import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = sc.next();

        S = Arrays.stream(S.split("dreameraser")).collect(Collectors.joining());
        S = Arrays.stream(S.split("dreamerase")).collect(Collectors.joining());
        S = Arrays.stream(S.split("dreamer")).collect(Collectors.joining());
        S = Arrays.stream(S.split("dream")).collect(Collectors.joining());
        S = Arrays.stream(S.split("eraser")).collect(Collectors.joining());
        S = Arrays.stream(S.split("erase")).collect(Collectors.joining());

        System.out.println(S.length() == 0 ? "YES" : "NO");
        // dreameraser
        // dreamerase
        // dreamer
        // dream
        // erase
    }
}
