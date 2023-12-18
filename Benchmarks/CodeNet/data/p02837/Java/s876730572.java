import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Boolean>[] a = new Map[n];
        for(int i=0; i<n; i++) {
            Map<Integer, Boolean> ai = new HashMap<>();
            int count = in.nextInt();
            for(int j=0; j<count; j++) {
                int x = in.nextInt() - 1;
                boolean y = in.nextInt() == 1;
                ai.put(x, y);
            }
            a[i] = ai;
        }
        int max = 0;
        int two_pow_n = (int)Math.pow(2, n);
        for(int assume=0; assume<two_pow_n; assume++) {
            int honestCount = Integer.toString(assume, 2).replaceAll("0", "").length();
            if(honestCount <= max) {
                continue;
            }
            if(isValid(n, a, assume)) {
                max = honestCount;
            }
        }
        System.out.println(max);
    }
    private static boolean isValid(int n, Map<Integer, Boolean>[] a, int assume) {
        for(int i=0; i<n; i++) {
            if((assume & (1<<i)) == 0) {
                continue;
            }
            Map<Integer, Boolean> ai = a[i];
            Set<Integer> keySet = ai.keySet();
            Iterator<Integer> it = keySet.iterator();
            while(it.hasNext()) {
                int x = it.next();
                boolean y = ai.get(x);
                int assumption = (assume & (1<<x));
                if(y && assumption > 0) {
                    // valid
                }
                else if(!y && assumption == 0) {
                    // valid
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
