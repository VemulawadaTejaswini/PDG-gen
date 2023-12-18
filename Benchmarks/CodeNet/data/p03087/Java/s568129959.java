
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = new Integer(temp[0]);
        int Q = new Integer(temp[1]);

        String S = scanner.nextLine();

        boolean flag = false;
        char[] charArray = S.toCharArray();
        int count = 0;
        int[] ret = new int[N];
        for (int i = N-1; i >= 0; i--) {
            char c = charArray[i];
            if (c == 'C') {
                flag = true;
            } else if (c == 'A') {
                if (flag) {
                    count++;
                }
                flag = false;
            } else {
                flag = false;
            }
            ret[i] = count;
        }

        for (int i = 0; i < Q; i++) {
            temp = scanner.nextLine().split(" ");
            int l = new Integer(temp[0]);
            int r = new Integer(temp[1]);

            System.out.println(ret[l-1]-ret[r-1]);
        }
    }

}
