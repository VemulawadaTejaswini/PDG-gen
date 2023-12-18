import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String[] vStr = sc.nextLine().split(" ");

        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = Double.parseDouble(vStr[i]);
        }

        Arrays.sort(v);

        double ans = v[0];
        for(int i = 1 ; i < n; i++){
            ans = (ans + v[i]) / 2;
        }

        System.out.println(ans);

        return;
    }
}