import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] mods = new int[300002];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n] = 300000;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            mods[arr[i] + 1] = arr[i];
        }
        for (int i = arr[n - 1] + 1; i < 300002; i++) {
            mods[i] = arr[n - 1];
        }
        for (int i = 2; i <= arr[n - 1]; i++) {
            if (mods[i] == 0) {
                for (int j = 0; j < n; j++) {
                    mods[i] = Math.max(mods[i], arr[j] % i);
                    if (mods[i] == i - 1) {
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            sb.append(mods[x]).append("\n");
        }
        System.out.print(sb);
    }
}

