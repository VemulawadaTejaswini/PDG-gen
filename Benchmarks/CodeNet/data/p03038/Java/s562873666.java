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
        int count = 0;
        long sum = 0;
        changeList = changeList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int a : A) {
            if (changeList.size() > count && a < changeList.get(count)) {
                sum += changeList.get(count);
                count++;
            } else {
                sum += a;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}