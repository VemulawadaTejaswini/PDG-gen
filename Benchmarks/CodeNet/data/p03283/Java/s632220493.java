import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        int map[][] = new int[n][n];
        for (int i = 0;i < m;++i){
            int start = scanner.nextInt() - 1;
            int end  = scanner.nextInt() - 1;
            for (int j = 0;j <= start;++j){
                for (int k = end;k < n;++k){
                    ++map[j][k];
                }
            }
        }
        int starts[] = new int[q];
        int ends[] = new int[q];
        for (int i = 0;i < q;++i) {
            starts[i] = scanner.nextInt() - 1;
            ends[i] = scanner.nextInt() - 1;
        }
        for (int i = 0;i < q;++i) {
            System.out.println(map[starts[i]][ends[i]]);
        }

    }

}


