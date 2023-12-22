import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.next();
            if (S.equals("-")) {
                break;
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int h = sc.nextInt();
                S = S.substring(h) + S.substring(0, h);
            }

            System.out.println(S);
        }
    }
}