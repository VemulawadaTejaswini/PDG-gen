import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Long,Long> tree = new TreeMap<>();
        for (int i=0;i<n;i++){
            long x = sc.nextLong();
            long l = sc.nextLong();
            tree.put(x+l,x-l);
        }
        long cur = Long.MIN_VALUE;
        int ans = 0;
        for (int i=0;i<n;i++){
            if (cur<=tree.firstEntry().getValue()){
                ans++;
                cur = tree.pollFirstEntry().getKey();
            }else {
                tree.pollFirstEntry();
            }
        }
        System.out.println(ans);
    }
}
