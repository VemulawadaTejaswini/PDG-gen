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
        A = A.stream().sorted().collect(Collectors.toList());

        int count = 0;
        long sum = 0;
        for (int i = 0; i < changeList.size() && A.get(i) <= changeList.get(i); i++) {
            count++;
            sum += changeList.get(i);
        }
        for (int i = count; i < A.size(); i++) {
            sum += A.get(i);
        }
        System.out.println(sum);
        sc.close();
    }
}