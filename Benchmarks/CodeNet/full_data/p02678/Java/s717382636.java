import java.util.*;

class Main{
    static int nmax = 100000;
    static int[] res = new int[nmax+1];
    static int[] steps = new int[nmax+1];
    static Map<Integer, List<Integer>> path = new HashMap<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
            steps[i] = 99999999;
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            List<Integer> atmp = path.get(a);
            atmp.add(b);
            path.put(a, atmp);
            List<Integer> btmp = path.get(b);
            btmp.add(a);
            path.put(b, btmp);
        }

        search(1, 0, 0);

        for (int i = 2; i <= n; i++) {
            if (res[i] == 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 2; i <= n; i++) {   
            System.out.println(res[i]);
        }
    }

    private static void search(int now, int step, int before) {
        int min_step = steps[now];
        if(step >= min_step)return;
        steps[now] = step;
        res[now] = before;
        List<Integer> roots = path.get(now);
        for (Integer p : roots) {
            search(p, step+1, now);
        }
        return;
    }

}
