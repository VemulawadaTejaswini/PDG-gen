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
        int listSize = N < changeList.size() ? N : changeList.size();
        changeList = changeList.stream().sorted(Comparator.reverseOrder()).limit(listSize).collect(Collectors.toList());

        Iterator changeValue = changeList.iterator();

        System.out.println(A.stream().sorted().mapToLong(a -> {
            if (changeValue.hasNext()) {
                int temp = (Integer) changeValue.next();
                if (a < temp) {
                    return temp;
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