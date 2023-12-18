import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int[][] D = new int[C][C];
        int[][] c = new int[N][N];
        for (int i=0;i<C;i++) {
            for (int j=0;j<C;j++) {
                D[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                c[i][j] = Integer.parseInt(sc.next());
            }
        }

        ArrayList<HashMap<Integer, Integer>> map_list = new ArrayList<HashMap<Integer, Integer>>();
        for (int i=0;i<3;i++) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j=0;j<N;j++) {
                for (int k=0;k<N;k++) {
                    if ((j+k)%3==i) {
                        if (!map.containsKey(c[j][k])) {
                            map.put(c[j][k], 1);
                        } else {
                            map.put(c[j][k], map.get(c[j][k])+1);
                        }
                    }
                }
            }
            map_list.add(map);
        }

        long ans = Integer.MAX_VALUE;
        for (int i=0;i<C;i++) {
            for (int j=0;j<C;j++) {
                for (int k=0;k<C;k++) {
                    if (i==j || i==k || j==k) {
                        continue;
                    }
                    // System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    long tmp = 0L;
                    for (int l=0;l<3;l++) {
                        for (Entry<Integer, Integer> entry : map_list.get(l).entrySet()) {
                            int key = entry.getKey();
                            int value = entry.getValue();
                            // System.out.println(entry.getKey() + " " + entry.getValue());
                            int index;
                            if (l==0) {
                                index = i;
                            } else if (l==1) {
                                index = j;
                            } else {
                                index = k;
                            }
                            tmp += value*D[key-1][index];
                            // System.out.println("value index key-1 " + value + " " + index + " " + (key-1));
                        }
                    }
                    ans = Math.min(ans, tmp);
                }
            }
        }
        // System.out.println(map_list);
        System.out.println(ans);
    }
}