import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        List<Map.Entry<Integer, Map.Entry<String, Integer>>> list = new ArrayList<>();
        for (int i=1; i <= n; i++) {
            list.add(
                    new AbstractMap.SimpleEntry<>(i,
                            new AbstractMap.SimpleEntry<>(
                                    sc.next(),
                                    sc.nextInt()
                            )
                    )
            );
        }

        list.sort((o1, o2) -> {
            if (o1.getValue().getKey().compareTo(o2.getValue().getKey()) > 0)
                return 100;
            else if (o1.getValue().getKey().compareTo(o2.getValue().getKey()) == 0) {
                return sign(o2.getValue().getValue() - o1.getValue().getValue());
            } else
                return -100;
        });

        list.forEach(e -> System.out.println(e.getKey()));

    }

    private static int sign(int i) {
        if (i > 0)
            return 1;
        else if (i == 0)
            return 0;
        else
            return -1;
    }
}
