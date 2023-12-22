import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }
        ArrayList<Integer[]> termList = new ArrayList<Integer[]>();
        for (int i = 0; i < q; i++) {
            Integer[] term = {sc.nextInt(), sc.nextInt()};
            termList.add(term);
        }
        sc.close();

        for (int query = 0; query < q; query++) {
            Integer start = termList.get(query)[0];
            Integer end = termList.get(query)[1];
            ArrayList<Integer> count = new ArrayList<Integer>();
            for (int i = start - 1; i < end; i++) {
                Integer color = c.get(i);
                if (!count.contains(color)) {
                    count.add(color);
                }
            }
            System.out.println(count.size());
        }
    }
}
