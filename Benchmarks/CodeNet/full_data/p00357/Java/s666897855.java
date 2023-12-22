
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int t[] = new int[n];
        int best = 0;
        boolean no = false;

        for (int i = 0; i < n; i++) {
            t[i] = scan.nextInt();
        }

        for (int b = 0; b < n; b++) {
            if (best < b * 10) {
                no = true;
                break;
            }
            if (best < b * 10 + t[b]) {
                best = b * 10 + t[b];
            }
        }

        if (!no) {
            best = 0;
            for (int b = 0; b < n; b++) {
                if (best < b * 10) {
                    no = true;
                    break;
                }
                if (best < b * 10 + t[n - 1 - b]) {
                    best = b * 10 + t[n - 1 - b];
                }
            }
        }

        if (!no) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

