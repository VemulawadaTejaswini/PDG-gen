import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        System.out.println(aArr[aArr.length - 1] - aArr[0]);
    }
}
