import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt(), m = scn.nextInt();
            int[] fld = new int[n];
            for(int i = 0; i < n; i++) {
                fld[i] = scn.nextInt();
            }
            int pt = 0, cnt = 0;
            try {
                for(int i = 0; i < m; i++) {
                    cnt++;
                    pt += scn.nextInt();
                    pt += fld[pt];
                }
            } catch(ArrayIndexOutOfBoundsException ignore) {}
            System.out.println(cnt);
        }
    }
}