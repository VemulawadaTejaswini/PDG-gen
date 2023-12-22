import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if (n == 0)
                break;
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> out = new ArrayList<Integer>();
            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    out.add(i);
                }
            } else {
                if (a <= 5) {
                    for (int i = a; i >= b; i--) {
                        out.add(i);
                    }
                } else {
                    for (int i = a; i <= 9; i++) {
                        out.add(i);
                    }
                    if (b >= 6) {
                        for (int i = 5; i > 0; i--) {

                            out.add(i);
                        }
                        for (int i = 0; i <= b; i++) {
                            out.add(i);
                        }
                    } else {
                        for (int i = 5; i >= b; i--) {
                            out.add(i);
                        }

                    }
                }
            }
            boolean init = true;
            for (int i = 0; i < out.size(); i++) {
                if (init) {
                    init = false;
                } else {
                    System.out.print(" ");
                }
                System.out.print(out.get(i));
            }
            System.out.println();
            n--;
        }
    }
}