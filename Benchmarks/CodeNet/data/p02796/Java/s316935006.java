import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        TreeSet<Integer> remain = new TreeSet<>();
        int[] s = new int[n];
        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            int l = sc.nextInt();
            tree.put(x+l,i);
            s[i]=x-l;
        }
        int ans = 0;
        remain.add(tree.pollFirstEntry().getKey());
        for (int i=1;i<n;i++){
            Map.Entry<Integer,Integer> now = tree.pollFirstEntry();
            int S = s[now.getValue()];
            if (remain.last()-1>S)ans++;
            else remain.add(now.getKey());
        }
        System.out.println(n-ans);
    }
}
