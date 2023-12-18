import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        boolean b[] = new boolean[N];
        for (int i=0; i<N; i++) {
            A.add(new ArrayList<Integer>());
            for (int j=0; j<N-1; j++) {
                A.get(i).add(Integer.parseInt(sc.next())-1);
            }
        }
        sc.close();

        int day = 0;
        int cnt = 0;
        boolean all;
        do {
            all = true;
            for (int i=0; i<N; i++) {
                if (A.get(i).size()>0) {
                    b[i] = true;
                    cnt++;
                }
            }
            if (cnt==0)
                break;
            for (int i=0; i<N-1; i++) {
                if (!b[i])
                    continue;
                for (int j=i+1; j<N; j++) {
                    if (b[i] && b[j] && j==A.get(i).get(0) && i==A.get(j).get(0)) {
                        b[i] = false;
                        b[j] = false;
                        A.get(i).remove(0);
                        A.get(j).remove(0);
                        all = false;
                        break;
                    }
                }
            }
            if (all) {
                break;
            } else {
                day++;
                cnt = 0;
            }
        } while(!all);
        if (cnt>0 && all) {
            System.out.println("-1");
        } else {
            System.out.println(day);
        }
    }
}
