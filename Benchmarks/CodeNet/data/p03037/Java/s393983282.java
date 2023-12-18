
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> okList = new ArrayList<>();
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        for (int k=left; k <= right; k++) {
            okList.add(k);
        }

        for (int i=1; i < M; i++) {
            left = scanner.nextInt();
            right = scanner.nextInt();
            int leftIndex = okList.indexOf(left);
            int rightIndex = okList.indexOf(right);

            leftIndex = leftIndex > 0 ? leftIndex : 0;
            rightIndex = rightIndex > 0 ? rightIndex + 1 : okList.size();
            okList = okList.subList(leftIndex, rightIndex);
        }

        System.out.println(okList.size());
    }
}