import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int l = Integer.parseInt(scanner.next());

        String[] ans = new String[n];
        for (int i=0; i< n; i++) {
            ans[i] = scanner.next();
        }

        Arrays.sort(ans);

        for (String a: ans)
            System.out.print(a);

    }
}
