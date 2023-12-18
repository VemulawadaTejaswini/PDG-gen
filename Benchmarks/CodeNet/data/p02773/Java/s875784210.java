import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<String, Data> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            map.putIfAbsent(s, new Data(s, 0));
            map.get(s).plus(1);
        }

        HashMap<Integer, ArrayList<Data>> map1 = new HashMap<>();
        // reduceでやるの大変だったのでforEachでやる
        map.values().stream().forEach(v -> {
            map1.putIfAbsent(v.getCount(), new ArrayList<>());
            map1.get(v.getCount()).add(v);
        });

        Integer max = map1.keySet().stream().max(Comparator.naturalOrder()).get();
        map1.get(max).stream().sorted(Comparator.comparing(Data::getKey)).forEach(it -> {
            System.out.println(it.getKey());
        });

    }
}

class Data {
    private String key;
    private int count;

    public Data(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public void plus(int num) {
        this.count += num;
    }

    public String getKey() {
        return key;
    }

    public int getCount() {
        return count;
    }


}
