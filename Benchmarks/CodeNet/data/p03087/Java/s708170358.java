import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < q; i++) {
            int ac = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            String cut = s.substring(l - 1, r);
            for (int j = 0; j < cut.length(); j++) {
                int in = cut.indexOf("AC", j);
                if (j == in) {
                    ac++;
                }
            }
            System.out.println(ac);
        }
    }
}