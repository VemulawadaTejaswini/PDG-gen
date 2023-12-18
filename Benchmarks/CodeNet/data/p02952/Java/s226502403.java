import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        if (N < 10) {
            System.out.println(N);
        } else if (N < 100) {
            System.out.println(9);
        } else if (N < 1000) {
            ans += 9;
            String stringN = String.valueOf(N);
            String lead = stringN.substring(0, 1);
            String rest = stringN.substring(1, stringN.length());
            ans += Integer.parseInt(rest) + 1 + (Integer.parseInt(lead) - 1) * 100;
            System.out.println(ans);
        } else if (N < 10000) {
            System.out.println(909);
        } else if (N < 100000) {
            ans += 909;
            String stringN = String.valueOf(N);
            String lead = stringN.substring(0, 1);
            String rest = stringN.substring(1, stringN.length());
            ans += Integer.parseInt(rest) + 1 + (Integer.parseInt(lead) - 1) * 10000;
            System.out.println(ans);
        } else {
            System.out.println(90909);
        }
    }
}
