import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int a = scanner.nextInt();
        Map<Integer, Integer> coordinates2hp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int h = scanner.nextInt();
            coordinates2hp.put(x, h);
        }
        List<Integer> coordinates = new ArrayList<>(n);
        List<Integer> hps = new ArrayList<>(n);
        for (int coordinate : coordinates2hp.keySet()) {
            int hp = coordinates2hp.get(coordinate);
            coordinates.add(coordinate);
            hps.add(hp);
        }
        long count = 0;
        /* 端から順番に攻撃する */
        for (int i = 0; i < n; i++) {
            int hp = hps.get(i);
            if (hp <= 0)
                continue; // 攻撃せずにスキップ
            int attackCount = divideCeil(hp, a);
            count += attackCount;
            long damage = attackCount * (long) a;
            if (damage > Integer.MAX_VALUE)
                damage = Integer.MAX_VALUE;
            long attackInclusive = (long) coordinates.get(i) + 2 * d;
            for (int j = i; j < n; j++) {
                int cc = coordinates.get(j);
                if (cc > attackInclusive)
                    break;
                int hh = hps.get(j);
                hps.set(j, (int) (hh - damage));
            }
        }
        System.out.println(count);
    }

    static int divideCeil(int numerator, int denominator) {
        double a = numerator;
        double b = denominator;
        return (int) Math.ceil(a / b);
    }
}