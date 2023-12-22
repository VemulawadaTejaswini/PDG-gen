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

        List<Integer> firstnow = new ArrayList<>();
        firstnow.add(1);
        List<Integer> firstbef = new ArrayList<>();
        firstbef.add(0);
        
        search(firstnow, 0, firstbef);

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

    private static void search(List<Integer> nows, int step, List<Integer> befores) {
        List<Integer> next_rooms = new ArrayList<>();

        for (int i=0;i<nows.size();i++) {
            int now = nows.get(i);
            int before = befores.get(i);
            int min_step = steps[now];
            if(step >= min_step)continue;
            steps[now] = step;
            res[now] = before;
            next_rooms.add(now);
        }

        if(next_rooms.isEmpty())return;

        List<Integer> next_nows = new ArrayList<>();
        List<Integer> next_befores = new ArrayList<>();

        for (Integer b : next_rooms) {
            List<Integer> root = path.get(b);
            for (Integer r : root) {
                next_nows.add(r);
                next_befores.add(b);
            }
        }
        search(next_nows, step+1, next_befores);
        return;
    }

}
