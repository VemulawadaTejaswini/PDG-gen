import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - 1;
        }
        
        List<Integer> to = new ArrayList<Integer>();
        int now = 0;
        to.add(now);
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                System.out.println(now+1);
                return;
            }
            now = array[now];
            if (now == 0) break;
            to.add(now);
            // System.out.println(now+1);
        }
        
        long tmp = k % to.size();
        if (k < to.size()) {
            tmp = k;
        }
        int tmp2 = (int)tmp;
        System.out.println(to.get(tmp2)+1);
    }
}
