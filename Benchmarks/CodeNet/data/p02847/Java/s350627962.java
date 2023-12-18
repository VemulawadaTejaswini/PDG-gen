import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            int ans = Arrays.asList("SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN").indexOf(S) + 1;

            System.out.println(ans);
        }
    }

}
