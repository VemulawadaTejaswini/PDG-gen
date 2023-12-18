import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int d = Integer.parseInt(s.split(" ")[1]);

        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            String[] temp = s.split(" ");
            for (int j = 0; j < d; j++) {
                x[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                double dis = 0;
                for (int k = 0; k < d; k++) {
                    dis += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }

                if (Math.sqrt(dis) == Math.ceil(Math.sqrt(dis))) {
                    ans++;
                }
            }
        }

        System.out.println(ans);


        return;
    }
}
