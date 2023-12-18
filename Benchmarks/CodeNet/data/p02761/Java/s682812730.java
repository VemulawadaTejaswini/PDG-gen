import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];
        Arrays.fill(list, - 1);
        for (int i = 0; i < m; i++) {
            int orderIndex = sc.nextInt();
            int v = sc.nextInt();
            if (list[orderIndex - 1] >= 0 && list[orderIndex - 1] != v) {
                System.out.println(-1);
                return;
            }
            list[orderIndex -1] = v;
        }
        
        if (n > 1 && list[0] == 0) {
            System.out.println(-1);
            return;
        }
        
        if (list[0] == -1) {
            list[0] = 1;
        }
       
        StringBuilder builder = new StringBuilder();
        for (Integer v: list
             ) {
            if (v == - 1) {
                v = 0;
            }
            builder.append(v);
        }
        int ans = Integer.parseInt(builder.toString());
        System.out.println(ans);
    }
}
