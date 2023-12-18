import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n= nextInt(sc);
        int[] honest = new int[n];
        for (int i = 0; i < n; i++) {
            int ai = nextInt(sc);
            for (int j = 0; j < ai ; j++) {
                int xij = sc.nextInt();
                int yij = sc.nextInt();
                if(yij == 1 && honest[xij-1] != 2) honest[xij-1] = 1;
                else honest[xij-1] = 2;
                if(sc.hasNext())sc.nextLine();
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(honest[i] == 1) res++;
        }
        System.out.println(res);
    }

    private static int solve(String s, int n) {
        return n;
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
}