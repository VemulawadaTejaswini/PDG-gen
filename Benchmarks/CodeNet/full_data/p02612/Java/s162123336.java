import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ans = 0;

        if (N < 1000) {
            ans = 1000 - N;
        } else if (N % 1000 == 0){
            System.out.println(0);
            System.exit(0);
        } else {
            String t = String.valueOf(N);
            char c = t.charAt(0);
            int thousand = Character.getNumericValue(c)*1000;
            ans = 1000 - (N - thousand);
        }

        System.out.println(ans);
    }
}
