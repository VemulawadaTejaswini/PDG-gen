import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String sp = sc.nextLine();
        int[] p;
        if (sp.equals("")) {
            p = new int[0];
        } else {
            p = Arrays.stream(sp.split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int ans = 0;
        int index = 0;
        boolean canBreak = false;
        if (p.length == 0) ans = x;
        else {
            while (true) {
                for (int i = 0; i < p.length; i++) {
                    if (p[i] == x - index) {
                        break;
                    }
                    if (i == p.length - 1) {
                        ans = x - index;
                        canBreak = true;
                    }
                }
                if (canBreak) break;
                for (int i = 0; i < p.length; i++) {
                    if (p[i] == x + index) {
                        break;
                    }
                    if (i == p.length - 1) {
                        ans = x + index;
                        canBreak = true;
                    }
                }
                if (canBreak) break;
                index++;
            }
        }
        System.out.println(ans);
    }
}