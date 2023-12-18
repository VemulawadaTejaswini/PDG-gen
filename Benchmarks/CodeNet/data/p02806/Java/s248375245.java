import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] title = new String[n];
        int[] time = new int[n];
        
        for (int i = 0; i < n; i++) {
            title[i] = sc.next();
            time[i] = sc.nextInt();
        }
        String sleep = sc.next();
        boolean after = false;
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (after) {
                cnt += time[i];
            }
            if (title[i].equals(sleep)) {
                after = true;
            }
        }
        
        System.out.println(cnt);
    }
}
