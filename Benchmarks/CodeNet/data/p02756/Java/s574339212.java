import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final String s  = sc.next();
            final int q = sc.nextInt();

            StringBuilder sb = new StringBuilder(s);
            boolean reversed = false;

            for (int i=0; i<q; i++) {
                int t = sc.nextInt();
                if (t == 1) {
                    reversed = !reversed;

                } else {
                    int f = sc.nextInt();
                    char c = sc.next().charAt(0);
                    if (f == 1) {
                        if (!reversed) {
                            sb.insert(0, c);
                        } else {
                            sb.append(c);
                        }
                    } else {
                        if (!reversed) {
                            sb.append(c);
                        } else {
                            sb.insert(0, c);
                        }
                    }
                }
            }

            if (reversed) {
                sb = sb.reverse();
            }

            System.out.println(sb);

        } finally {
            sc.close();
        }
    }
}
