import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);

        int[][] bc = new int[m][2];
        for (int i = 0; i < m; i++) {
            bc[i][0] = scanner.nextInt();
            bc[i][1] = scanner.nextInt();
        }
        Arrays.sort(bc, Comparator.<int[]>comparingInt(ar -> ar[1]).reversed());

        long sum = 0;
        for (int[] array : bc) {
            for (int i = 0; i < array[0]; i++) {
                if (a.get(0) >= array[1] || a.isEmpty()) {
                    break;
                }
                a.remove(0);
                sum += array[1];
            }
        }

        for (int i : a) {
            sum += i;
        }

        System.out.println(sum);
    }
}