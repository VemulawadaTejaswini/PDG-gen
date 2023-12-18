import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] number = new int[m];
        String[] result = new String[m];
        for (int i = 0; i < m; i++) {
            number[i] = sc.nextInt();
            result[i] = sc.next();
        }

        int ac = 0;
        int wa = 0;
        boolean firstAc = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (number[j] == i) {
                    if (result[j].equals("AC") && firstAc) {
                        ac++;
                        firstAc = false;
                    } else if (result[j].equals("WA") && firstAc) {
                        wa++;
                    }
                }
            }
            firstAc = true;
        }
        System.out.println(ac + " " + wa);
    }
}