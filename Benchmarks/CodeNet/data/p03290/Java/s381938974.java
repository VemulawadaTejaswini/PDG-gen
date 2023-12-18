import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt() /* <= 10 */, goal = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (i + 1) * 100; // for which score problem
            arr[i][1] = sc.nextInt(); // how many
            arr[i][2] = sc.nextInt(); // bonus
            arr[i][3] = arr[i][0] * arr[i][1] + arr[i][2]; // total
            arr[i][4] = arr[i][3] / arr[i][1]; // efficiency
        }

        // sort by efficiency
        Arrays.sort(arr, Comparator.comparingInt(a -> -a[4]));

        int count = 0;
        int progress = 0;
        int i = 0;
        for (; i < n; i++) {
            if (goal >= arr[i][3] + progress) {
                progress += arr[i][3];
                count += arr[i][1];
            } else {
                break;
            }
        }

        int[][] left = Arrays.copyOfRange(arr, i, arr.length);
        Arrays.sort(arr, Comparator.comparingInt(a -> -a[0]));

        for (int j = 0; j < left.length; j++) {
            for (int k = 0; k < left[j][1]; k++) {
                if (progress < goal) {
                    progress += left[j][0];
                    count++;
                } else {
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
