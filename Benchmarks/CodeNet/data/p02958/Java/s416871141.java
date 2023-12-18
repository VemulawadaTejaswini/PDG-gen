import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            x[i] = p[i];
        }
        Arrays.sort(x);
        int cnt = 0;
        for(int j = 0; j < n; j++) {
            if (x[j] != p[j]) {
                cnt++;
            }
        }
        String message = "";
        if (cnt > 2) {
            message = "NO";
        } else {
            message = "YES";
        }
        System.out.println(message);
    }
}