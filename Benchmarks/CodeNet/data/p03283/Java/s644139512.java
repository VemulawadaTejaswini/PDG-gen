import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nUp = sc.nextInt();
        int mUp = sc.nextInt();
        int qUp = sc.nextInt();
        String[] lrArray = makeArray(mUp, sc);
        String[] pqArray = makeArray(qUp, sc);
        for (String pq : pqArray) {
            String[] pqSplit = pq.split(",");
            int p = Integer.valueOf(pqSplit[0]);
            int q = Integer.valueOf(pqSplit[1]);
            
            int result = 0;
            for (String lr : lrArray) {
                String[] lrSplit = lr.split(",");
                int l = Integer.valueOf(lrSplit[0]);
                int r = Integer.valueOf(lrSplit[1]);
                if (p <= l && r <= q) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    private static String[] makeArray(int max, Scanner sc) {
        String[] array = new String[max];
        for (int i = 0; i < max; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[i] = a + "," + b;
        }
        return array;
    }
}