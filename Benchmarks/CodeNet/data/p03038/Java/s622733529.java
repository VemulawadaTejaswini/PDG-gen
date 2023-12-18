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
        A = A.stream().sorted().collect(Collectors.toList());

        System.out.println(changeList.size());

        for (int i = 0; i < N; i++) {
            if (changeList.size() <= i)
                break;
            else if (changeList.get(i) <= A.get(i))
                break;
            else
                A.set(i, changeList.get(i));
        }

        System.out.println(A.stream().mapToLong(i -> i.intValue()).sum());

        sc.close();
    }
}