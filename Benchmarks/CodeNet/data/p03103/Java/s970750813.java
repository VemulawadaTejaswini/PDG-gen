import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Shop> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Shop(sc.nextLong(), sc.nextInt()));
        }
        list.sort(Comparator.comparingLong(a -> a.value));

        long ans = 0;

        while (m > 0) {
            Shop target = list.get(0);
            list.remove(0);
            int kosu = Math.min(m, target.kosu);
            ans += target.value * kosu;
            m -= kosu;
        }

        System.out.println(ans);
    }

    public static class Shop {
        public long value;
        public int kosu;

        public Shop(long value, int kosu) {
            this.value = value;
            this.kosu = kosu;
        }
    }
}