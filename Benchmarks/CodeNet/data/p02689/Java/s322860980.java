import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]h = new int[n + 1];
        List[]lists = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
            lists[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lists[a].add(b);
        }
        int[]ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            List<Integer>l = lists[i];
            boolean valid = true;
            for(int is : l){
                if(h[i] < h[is]){
                    ans[i] = -1;
                }else{
                    ans[is] = -1;
                }
            }
        }
        int item = 0;
        for (int i = 1; i < ans.length; i++) {
            if(ans[i] != -1)
                item++;
        }
        System.out.println(item);
    }
}
