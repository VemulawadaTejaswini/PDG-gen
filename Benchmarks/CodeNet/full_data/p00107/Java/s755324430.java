import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] s = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            if(s[0]+s[1]+s[2]==0) {
                break;
            }
            for (int i = 0; i < s.length - 1; i++) {
                for (int j = i + 1; j < s.length; j++) {
                    if (s[i] > s[j]) {
                        int temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(isEntry(s[0], s[1], sc.nextInt() * 2));
            }
        }
    }

    static String isEntry(int a, int b, int n) {
        return a * a + b * b < n * n ? "OK" : "NA";
    }
}
