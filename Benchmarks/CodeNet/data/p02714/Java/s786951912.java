
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String s = scan.next();
        scan.close();

        String[] str = s.split("");

        int[] strCount = new int[3];
        for (String a : str) {
            if (a.equals("R")) {
                strCount[0] += 1;
            } else if (a.equals("G")) {
                strCount[1] += 1;
            } else {
                strCount[2] += 1;
            }
        }

        long count = strCount[0] * strCount[1] * strCount[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = 2 * j - i;
                if (k < n) {
                    if (str[i].equals(str[j])) {
                        continue;
                    }
                    if (str[j].equals(str[k])) {
                        continue;
                    }
                    if (str[k].equals(str[i])) {
                        continue;
                    }
                    count--;
                }
            }
        }

        System.out.println(count);
    }

}
