import java.util.*;

public class Main {

    public static int n;
    public static int work[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        work = new int[n][2];
        int finished = 0;
        boolean[] finish = new boolean[n];
        for (int i = 0; i < n; i++) {
            work[i][0] = sc.nextInt();
            work[i][1] = sc.nextInt();
            finish[i] = false;
        }

        int currentTime = 0;
        System.out.println(take(currentTime, finish, finished) ? "Yes" : "No");
    }

    public static boolean take(int currentTime, boolean[] finish, int finished) {
        if (finished == n) {
            return true;
        }
        if (check(currentTime, finish, finished)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (finish[i]) {
                continue;
            }
            int time = currentTime + work[i][0];
            if (time > work[i][1]) {
                return false;
            }
            boolean[] copyFinish = copy(finish);
            copyFinish[i] = true;
            if (take(time, copyFinish, finished + 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean check(int currentTime, boolean[] finish, int finished) {
        for (int i = 0; i < n; i++) {
            if (finish[i]) {
                continue;
            }
            if (currentTime > work[i][1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean[] copy(boolean[] finish) {
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = finish[i];
        }
        return arr;
    }
}
