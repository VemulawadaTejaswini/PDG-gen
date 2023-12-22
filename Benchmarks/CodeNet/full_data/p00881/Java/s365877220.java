import java.util.*;
public class Main {
    static int minmin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 && n == 0) break;
            List<boolean[]> data = new ArrayList<>();
            boolean[][] dset = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                boolean[] d = new boolean[m];
                for (int j = 0; j < m; j++) {
                    if (s.charAt(j) == '1')
                        d[j] = true;
                    else d[j] = false;
                    dset[i][j]=d[j];
                }
                data.add(d);
            }
            minmin = min_min(m,n,dset);
            System.out.println(solve(data,0,m));
        }
    }

    private  static int solve(List<boolean[]> data,int time,int size){
        if(data.size() == 1)return 0;
        int o=0,z=0,min=12;
        for(int i=0;i<size;i++){
            List<boolean[]> zero = new ArrayList<>();
            List<boolean[]> one = new ArrayList<>();
            for(boolean[] a:data){
                if(a[i])one.add(a);
                else zero.add(a);
            }
            if(one.size()==0||zero.size()==0)continue;
            o = solve(one,time+1,size);
            z = solve(zero,time+1,size);
            if(o>=z&&o<min)min=o;
            else if(z>o&&z<min)min=z;
            if(minmin-1==min+time)break;
        }
        return min+1;
    }



    public static int min_min(int m, int n, boolean[][] dset) {
        List<boolean[]> list = makelist(m);
        int max = 0;
        loop1:
        for (int i = 0; i < n; i++) {
            int ko;
            loop2:
            for (int a = 0; a < list.size(); a++) {
                boolean[] set = list.get(a);
                loop3:
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    loop4:
                    for (int k = 0; k < m; k++) {
                        if (!set[k]) continue;
                        if (dset[i][k] != dset[j][k]) continue loop3;
                    }
                    continue loop2;
                }
                /*
                    for (int p = 0; p < m; p++) {
                        if (!set[p]) continue;
                        if (dset[i][p]) System.out.print(1+"("+p+")");
                        else System.out.print(0+"("+p+")");
                    }
                System.out.println("-------");
                for (int q = 0; q < n; q++) {
                    if(q==i)continue;
                    for (int p = 0; p < m; p++) {
                        if (!set[p]) continue;
                        if (dset[q][p]) System.out.print(1);
                        else System.out.print(0);
                    }
                    System.out.print("\n");
                }
                System.out.println("");
                */
                ko = count(set);
                if (ko > max) max = ko;
                break;
            }
        }
        return max;
    }

    private static List<boolean[]> makelist(int m) {
        Map<Integer, boolean[]> map = new HashMap<>();
        Queue<boolean[]> que = new ArrayDeque<>();
        boolean[] a = new boolean[m];
        for (boolean b : a) b = false;
        que.add(a.clone());
        map.put(getkey(a), a.clone());
        while (!que.isEmpty()) {
            boolean[] b = que.remove();
            for (int i = 0; i < m; i++) {
                boolean[] c = b.clone();
                if (!c[i]) {
                    c[i] = true;
                    int key = getkey(c);
                    if (!map.containsKey(key)) {
                        que.add(c);
                        map.put(key, c);
                    }
                }
            }
        }
        List<boolean[]> list = new ArrayList<>(map.values());
        Collections.sort(list,
                new Comparator<boolean[]>() {
                    @Override
                    public int compare(boolean[] o1, boolean[] o2) {
                        return count(o1) - count(o2);
                    }
                }
        );
        return list;
    }

    private static int getkey(boolean[] a) {
        int key = 0, k = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) key += k;
            k *= 10;
        }
        return key;
    }

    private static int count(boolean[] be) {
        int count = 0;
        for (boolean b : be) {
            if (b) count++;
        }
        return count;
    }
