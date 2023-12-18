import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        int[] dist = new int[N];
        Arrays.fill(dist, -1);

        ArrayDeque<int[]> q = new ArrayDeque<int[]>();
        int[] first = {0, 0};
        q.add(first);
        while (!q.isEmpty()) {
            int[] rem = q.poll();
            if (dist[rem[0]]!=-1) continue;
            dist[rem[0]] = rem[1];
            for (Integer i : edge.get(rem[0])) {
                int[] add = {i, rem[1]+1};
                if (dist[i]==-1) q.add(add);
            }
        }
        // System.out.println(Arrays.toString(dist));
        HashSet<Integer> zero = new HashSet<Integer>();
        HashSet<Integer> one = new HashSet<Integer>();
        for (int i=0;i<N;i++) {
            dist[i]%=2;
            if (dist[i]==0) zero.add(i);
            if (dist[i]==1) one.add(i);
        }
        // System.out.println(zero);
        // System.out.println(one);
        if (zero.size()>one.size()) {
            HashSet<Integer> tmp = new HashSet<Integer>(zero);
            zero = one;
            one = tmp;
        }
        int[] ans = new int[N];
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i=1;i<=N;i++) {
            nums.add(i);
        }
        HashSet<Integer> index = new HashSet<Integer>();
        for (int i=0;i<N;i++) {
            index.add(i);
        }
        if (zero.size()<=N/3) {
            int num = 3;
            for (Integer i : zero) {
                ans[i] = num;
                nums.remove(num);
                index.remove(i);
                num+=3;
            }
            ArrayList<Integer> nums_list = new ArrayList<Integer>(nums);
            ArrayList<Integer> index_list = new ArrayList<Integer>(index);
            for (int i=0;i<nums_list.size();i++) {
                ans[index_list.get(i)] = nums_list.get(i);
            }
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<N;i++) {
                sb.append(ans[i]);
                if (i!=N-1) sb.append(" ");
            }
            System.out.println(sb);
        } else {
            int num = 1;
            HashSet<Integer> zero_tmp = new HashSet<Integer>(zero);
            for (Integer i : zero_tmp) {
                ans[i] = num;
                nums.remove(num);
                index.remove(i);
                zero.remove(i);
                num+=3;
                if (num>N) break;
            }
            num = 3;
            for (Integer i : zero) {
                ans[i] = num;
                nums.remove(num);
                index.remove(i);
                // zero.remove(i);
                num+=3;
            }
            ArrayList<Integer> nums_list = new ArrayList<Integer>(nums);
            ArrayList<Integer> index_list = new ArrayList<Integer>(index);
            for (int i=0;i<nums_list.size();i++) {
                ans[index_list.get(i)] = nums_list.get(i);
            }
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<N;i++) {
                sb.append(ans[i]);
                if (i!=N-1) sb.append(" ");
            }
            System.out.println(sb);
        }
        // System.out.println(zero);
        // System.out.println(one);
    }
}