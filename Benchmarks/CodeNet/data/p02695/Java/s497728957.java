import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] set = new int[Q][4];

        List<List<Integer>> target = new ArrayList<List<Integer>>();
        List<List<Integer>> anslist = new ArrayList<List<Integer>>();
        int sum = 0;

        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(1);
        target.add(tmp);

        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < 4; j++) {
                set[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 2; i <= M; i++) {
            List<List<Integer>> t = new ArrayList<List<Integer>>(target);
            for (List<Integer> l : t) {
                List<Integer> tmpl = new ArrayList<Integer>(l);
                tmpl.add(i);
                target.add(tmpl);
                if (tmpl.size() == N) {
                    anslist.add(tmpl);
                }
            }
            System.out.println(anslist);
        }

        for (List<Integer> a : anslist) {
            int num = 0;
            for (int i = 0; i < Q; i++) {
                if(a.get(set[i][1]-1) - a.get(set[i][0]-1) == set[i][2]) {
                    num += set[i][3];
                } else {
                    num += 0;
                }
                if (num >= sum) {
                    sum = num;
                }
            }
            System.out.println(num);
        }
        System.out.println(sum);
    }
}