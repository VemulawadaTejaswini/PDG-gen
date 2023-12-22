import java.io.PrintStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int limit = (int) Math.sqrt(n);
            boolean[] composites = new boolean[n + 1];
            composites[0] = composites[1] = true;
            int target = 2;
            while (true) {
                for (int i = target * 2; i <= n; i += target) {
                    composites[i] = true;
                }
                boolean found = false;
                for (int i = target + 1; i <= limit; i++) {
                    if (!composites[i]) {
                        target = i;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (!composites[i]) {
                    count++;
                }
            }
            out.println(count);
        }
    } 
}