import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        List<List<Long>> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            List<Long> query = new ArrayList<>();
            long q = scanner.nextLong();
            query.add(q);
            if (q == 1) {
                query.add(scanner.nextLong());
                query.add(scanner.nextLong());
            }
            queryList.add(query);
        }

        long fx = 0;
        long min = 0;
        long max = 0;
        long bSum = 0;
        List<Long> idxList = new ArrayList<>();

        for (List<Long> query : queryList) {
//            System.out.println(query);
            if (1 == query.get(0)) {
                idxList.add(query.get(1));
                bSum += query.get(2);
            } else {
                // idx sort
                Collections.sort(idxList);

                // median
                int median = (idxList.size() % 2 == 0) ? idxList.size() / 2 - 1 : idxList.size() / 2;
                long medianValue = idxList.get(median);

                // calc
                long minValue = idxList.stream().mapToLong(i -> {
                    long tmp = medianValue - i;
                    return (tmp > 0) ? tmp : -tmp;
                }).sum();

                // out
                System.out.println(medianValue + " " + (minValue + bSum));
            }
        }

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
