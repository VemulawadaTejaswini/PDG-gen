import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int countAc = 0;
        int countWa = 0;

        int pn = 0;
        for (int i = 0; i < m; i++) {
            int tmpPn = sc.nextInt();
            if (pn == tmpPn) {
                sc.next();
                continue;
            }
            if (sc.next().equals("WA")) {
                countWa++;
            } else {
                countAc++;
                pn = tmpPn;
            }
        }

        System.out.println(countAc + " " + countWa);
    }
}
