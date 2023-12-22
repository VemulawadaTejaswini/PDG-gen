import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            s = s.replaceAll(sc.next(), sc.next());
            System.out.println(Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).sum());
        }

    }
}
