import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<List<Integer>> list = new ArrayList<>();
    public static int[] co = new int[100010];
    public static boolean[] is = new boolean[100010];
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0;i < 100010;i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0;i < m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        int q = sc.nextInt();
        for (int i = 0;i < q;i++) {
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            paint(v, d, c, -1);
        }
        
        for (int i = 1;i <=n;i++) {
            System.out.println(co[i]);
        }
    }
    
    private static void paint(int v, int d, int c, int fr) {
        co[v] = c;
        if (d==0) return;
        for (int n: list.get(v)) {
            if (n!=fr) paint(n,d-1,c,v);
        }
    }
}
