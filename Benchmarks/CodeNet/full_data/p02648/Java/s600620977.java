import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, int[]> map = new HashMap<>();

        int[] v = new int[n];
        int[] w = new int[n];
        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int q = sc.nextInt();

        int[] root = new int[100001];
        root[w[0]] = v[0];
        map.put(1, root);

        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            int y = x;
            List<Integer> list = new ArrayList<>();
            while(y > 0) {
                list.add(y);
                y /= 2;
            }
            for(int j = list.size()-2; j>=0; j--) {
                int num = list.get(j);
                if(map.containsKey(num)) continue;
                int[] a = new int[100001];
                int[] prev = map.get(list.get(j+1));
                for(int k = 0; k <= 100000; k++) {
                    a[k] = Math.max(a[k], prev[k]);
                    if(k + w[num-1] >= 100000) continue;
                    a[k+w[num-1]] = Math.max(a[k+w[num-1]], prev[k]+v[num-1]);
                }
                map.put(num, a);
            }
            int res = 0;
            for(int j=0; j<=l; j++) {
                int[] a = map.get(x);
                res = Math.max(res, a[j]);
            }
            System.out.println(res);
        }
    }




}