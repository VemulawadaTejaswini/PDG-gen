
import java.util.*;
class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int vertical = scan.nextInt();
        int horizon  = scan.nextInt();
        int[][] container = new int[vertical][horizon];
        for(int v = 0; v < vertical; v++) {
            for (int h = 0; h < horizon;  h++) {
                container[v][h] = scan.nextInt();
            }
        }
        for(int h = 0; h < horizon; h++) {
            int multi = scan.nextInt();
            for (int v = 0; v < vertical;  v++) {
                container[v][h] *= multi;
            }
        }
        for(int v = 0; v < vertical; v++) {
            int total = 0;
            for (int h = 0; h < horizon;  h++) {
               total += container[v][h];
            }
            System.out.println(total);
        }
    }
}
