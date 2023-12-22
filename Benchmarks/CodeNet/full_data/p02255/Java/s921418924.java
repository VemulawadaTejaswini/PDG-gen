import java.util.*;

public class Main {
    public static void main(String[] args) {
        aldl_1_1_a();
    }


    static void aldl_1_1_a() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(sc.nextInt());
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int v = data.get(i);
            while (j >= 0 && data.get(j) > v) {
                data.set(j + 1, data.get(j));
                j--;
            }
            data.set(j + 1, v);
            for (int k = 0; k < n; k++) {
                if (k > 0)
                    System.out.print(" ");
                System.out.print(data.get(k));
            }
            System.out.println();
        }
    }
}
