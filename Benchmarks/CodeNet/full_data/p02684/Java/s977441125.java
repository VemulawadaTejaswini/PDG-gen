import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        List<Integer> to = new ArrayList<Integer>();
        int now = 1;
        to.add(now);
        for (int i = 0; i < n-1; i++) {
            now = array[now-1];
            if (now == 1) break;
            to.add(now);
            if (i == k - 1) {
                System.out.println(now);
                return;
            }
            // System.out.println(now+1);
        }
        
        long tmp = k % to.size();
        int tmp2 = (int)tmp;
        //  System.out.println(to.size());
        System.out.println(to.get(tmp2));
    }
}
