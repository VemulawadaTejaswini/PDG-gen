import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = new Integer(temp[0]);
        int Q = new Integer(temp[1]);

        String S = scanner.nextLine();

        boolean[] ac = new boolean[N];

        boolean flag = false;
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'A') {
                flag = true;
            } else if (c == 'C') {
                if (flag) {
                    ac[i-1] = true;
                }
                flag = false;
            } else {
                flag = false;
            }
        }

        for (int i = 0; i < Q; i++) {
            temp = scanner.nextLine().split(" ");
            int l = new Integer(temp[0]);
            int r = new Integer(temp[1]);

            int count = 0;
            for (int j = l-1; j < r-1; j++) {
                if (ac[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
