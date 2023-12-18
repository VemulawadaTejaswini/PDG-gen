import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            int A = sc.nextInt();

            if (list.size() == 0 || list.get(list.size()-1) >= A) {
                list.add(A);
            } else if (A > list.get(0)) {
                list.set(0, A);
            } else {
                int ok = list.size()-1;
                int ng = 0;
                while (ng+1 < ok) {
                    int m = (ok+ng)/2;
                    if (list.get(m) < A) {
                        ok = m;
                    } else {
                        ng = m;
                    }
                }
                list.set(ok, A);
            }
        }

        System.out.println(list.size());
    }
}
