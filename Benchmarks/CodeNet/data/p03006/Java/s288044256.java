import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[][] ball = new int[N][2];
        for(int i=0;i<N;i++){
            ball[i][0] = sc.nextInt();
            ball[i][1] = sc.nextInt();
        }
        int result = N;
        int p = 0;
        int q = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                p = ball[j][0] - ball[i][0];
                q = ball[j][1] - ball[i][1];
                int cost = cost_calc(ball, p, q);
                if(cost < result)result=cost;
            }
        }
        System.out.println(result);
    }

    public static int cost_calc(int[][] a, int p, int q) {
        int cost = 0;
        int N = a.length;
        Set<ArrayList<Integer>> tmp = new HashSet();
        for(int i=0;i<N;i++){
            int s = a[i][0];
            int t = a[i][1];
            for(int j=i;j<N;j++){
                int x = a[j][0];
                int y = a[j][1];
                if(x-p != s && y-q != t){
                    continue;
                }
                ArrayList<Integer> tmp2 = new ArrayList<>();
                tmp2.add(s);
                tmp2.add(t);
                tmp.add(tmp2);
            }
        }
        cost = tmp.size();
        return cost;
    }
}