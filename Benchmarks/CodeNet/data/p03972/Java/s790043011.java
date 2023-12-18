import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int[] p = new int[W];
        int[] q = new int[H];

        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i=0;i<W;i++) {
            p[i] = sc.nextInt();
            int[] add = {p[i], 0};
            list.add(add);
        }
        for (int i=0;i<H;i++) {
            q[i] = sc.nextInt();
            int[] add = {q[i], 1};
            list.add(add);
        }
        Collections.sort(list, (o1, o2)->Integer.compare(o1[0], o2[0]));

        int p_used = 0;
        int q_used = 0;
        long ans = 0L;
        for (int i=0;i<W+H;i++) {
            int val = list.get(i)[0];
            int flag = list.get(i)[1];
            if (flag==0) {
                ans += (long)val*(H+1-q_used);
                p_used++;
            } else { // flag==1
                ans += (long)val*(W+1-p_used);
                q_used++;
            }
        }
        System.out.println(ans);
    }
}