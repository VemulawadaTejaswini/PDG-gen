import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int Q = sc.nextInt();
        int[][] query = new int[Q][3];
        for (int i=0; i<Q; i++) {
            query[i][0] = sc.nextInt();
            query[i][1] = sc.nextInt();
            if (query[i][0] == 1) {
                query[i][2] = sc.next().toCharArray()[0];
            } else {
                query[i][2] = sc.nextInt();
            }

        }

        Integer[] ans = solve(N, S.toCharArray(), Q, query);
        for (int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }

        /*
        int[] sol = new int[ans.length];
        for (int i=0; i<sol.length; i++) {
            sol[i] = sc.nextInt();
        }
        for (int i=0; i<sol.length; i++) {
            if (ans[i] != sol[i]) {
                System.err.println("wrong anser on " + (i+1) + ": " + ans[i] + " != " + sol[i]);
            }
        }
         */
    }

    private static Integer[] solve(int N, char[] S, int Q, int[][] query) {
        List<Integer> ans = new ArrayList();

        TreeSet<Integer>[] set = new TreeSet[26];
        for (int i=0; i<26; i++) {
            set[i] = new TreeSet();
        }

        for (int i=0; i<N; i++) {
            set[S[i]-'a'].add(i);
        }

        for (int i=0; i<Q; i++) {
            // System.err.println("query " + i + ": " + query[i][0] + ", " + query[i][1] + ", " + query[i][2]);
            if (query[i][0] == 1) {
                int pos = query[i][1]-1;
                char chPre = S[pos];
                char chPost = (char)query[i][2];
                S[pos] = chPost;

                set[chPre-'a'].remove(pos);
                set[chPost-'a'].add(pos);
            } else {
                int sum = 0;
                int left = query[i][1]-1;
                int right = query[i][2]-1;


                for (int a=0; a<26; a++) {
                    // System.err.println("\tch=" + a + ", left=" + left);
                    Integer val = set[a].higher(left-1);
                    if (val != null && val <= right) {
                        sum++;
                    }
                }
                ans.add(sum);
            }
        }

        return ans.toArray(new Integer[0]);
    }
}
