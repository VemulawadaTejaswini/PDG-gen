import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        List<Integer> changeList = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            for (int j = 0; j < B; j++) {
                changeList.add(C);
            }
        }

        changeList = changeList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Arrays.sort(A);

        for (int i = 0; i < changeList.size(); i++) {
            if (changeList.get(i) < A[i]) {
                break;
            } else {
                A[i] = changeList.get(i);
            }
        }

        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        System.out.println(sum);
        sc.close();
    }
}