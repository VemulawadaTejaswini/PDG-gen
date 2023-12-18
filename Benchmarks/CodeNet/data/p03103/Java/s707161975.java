import java.util.*;
import java.util.stream.Collectors;

class Store {
    long cost, count;

    public Store(long cost, long count) {
        this.cost = cost;
        this.count = count;
    }

    long toSum() {
        return this.cost * this.count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Store> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Store(sc.nextLong(), sc.nextLong()));
        }

        long costSum = 0;
        ArrayDeque<Store> sorted = list.stream().sorted((x, y) -> (int)(x.cost - y.cost)).collect(Collectors.toCollection(ArrayDeque::new));

        boolean isCompleted = false;
        while (!isCompleted) {
            Store next = sorted.pop();
//            System.out.println("cost: " + next.cost + " count: " + next.count + " m: " + m + " costSum: " + costSum);
            if (m <= next.count) {
                costSum += next.cost * m;
                isCompleted = true;
            } else {
                m -= next.count;
                costSum += next.toSum();
            }
        }

        System.out.println(costSum);

    }
}
