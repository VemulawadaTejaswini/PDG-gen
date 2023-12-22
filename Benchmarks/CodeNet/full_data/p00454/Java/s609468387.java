import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        int W = sc.nextInt();
        int H = sc.nextInt();
        if (W==0 && H==0) {
            break;
        }
        int N = sc.nextInt();
        int[] x1 = new int[N];
        int[] y1 = new int[N];
        int[] x2 = new int[N];
        int[] y2 = new int[N];
        for (int i=0;i<N;i++) {
            x1[i] = Integer.parseInt(sc.next());
            y1[i] = Integer.parseInt(sc.next());
            x2[i] = Integer.parseInt(sc.next());
            y2[i] = Integer.parseInt(sc.next());
        }
        // int ggg = Integer.parseInt(sc.next());
        // int hhh = Integer.parseInt(sc.next());
        // System.out.println(Arrays.toString(x1));
        // System.out.println(Arrays.toString(x2));
        int w = compress(x1, x2, W);
        int h = compress(y1, y2, H);
        // System.out.println("w: " + w + " h: " + h);
        // System.out.println(Arrays.toString(x1));
        // System.out.println(Arrays.toString(x2));
        // System.out.println(Arrays.toString(y1));
        // System.out.println(Arrays.toString(y2));
        int[][] map = new int[h][w];
        for (int i=0;i<N;i++) {
            for (int j=y1[i];j<y2[i];j++) {
                for (int k=x1[i];k<x2[i];k++) {
                    map[j][k]=1;
                }
            }
        }
        // for (int i=0;i<h;i++) {
        //     System.out.println(Arrays.toString(map[i]));
        // }

        int cnt = 0;
        LinkedList<int[]> dfs = new LinkedList<int[]>();
        for (int i=0;i<h;i++) {
            for (int j=0;j<w;j++) {
                if (map[i][j]==1) {
                    continue;
                }
                cnt++;
                int[] add = {i, j};
                dfs.add(add);
                while(dfs.size()!=0) {
                    int[] rem = dfs.removeLast();
                    if (!(0<=rem[0] && rem[0]<h && 0<=rem[1] && rem[1]<w) || map[rem[0]][rem[1]]==1) {
                        continue;
                    } else {
                        map[rem[0]][rem[1]]=1;
                        int[] add_1 = {rem[0]+1, rem[1]};
                        int[] add_2 = {rem[0], rem[1]+1};
                        int[] add_3 = {rem[0]-1, rem[1]};
                        int[] add_4 = {rem[0], rem[1]-1};
                        dfs.add(add_1);
                        dfs.add(add_2);
                        dfs.add(add_3);
                        dfs.add(add_4);
                    }
                }
            }
        }
        System.out.println(cnt);
        // System.out.println(Arrays.deepToString(map));
        }
    }
    public static int compress(int[] x1, int[] x2, int w) {
        int n = x1.length;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(w);
        for (int i=0;i<n;i++) {
            set.add(x1[i]);
            set.add(x2[i]);
        }
        int nw = set.size();
        Integer[] x = set.toArray(new Integer[nw]);
        for (int i = 0; i < n; i++) {
            x1[i] = Arrays.binarySearch(x, x1[i]);
            x2[i] = Arrays.binarySearch(x, x2[i]);
        }
        return nw - 1;
    }
}
