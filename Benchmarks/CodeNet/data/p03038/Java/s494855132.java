import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> changeList = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        for (int i = 0; i < M; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            for (int j = 0; j < B; j++) {
                changeList.add(C);
            }
        }
        changeList = changeList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Iterator iterator = changeList.iterator();

        System.out.println(A.stream().sorted().mapToLong(a -> {
            if (iterator.hasNext()) {
                Integer changeValue = (Integer) iterator.next();
                if (a < changeValue) {
                    return changeValue;
                } else {
                    return a;
                }
            } else {
                return a;
            }
        }).sum());
        sc.close();
    }
}