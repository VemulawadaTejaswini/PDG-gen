import java.util.*;

class Main{
    public static boolean check(ArrayList<Integer> a, int N, int K) {
        int M = a.size();
        int offset = 0;
        for (int i = 0; i < M; ++i) {
            if (offset + K > N) continue;
            if (offset + a.get(i) - K >= 0)
                return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int N = s.length();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < N;) {
            int j;
            for (j = i; j < N && s.charAt(i) == s.charAt(j); ++j) ;
            a.add(j - i);
            i = j;
        }

        int l = 1, u = N+1;
        while (u - l > 1) {
            int c = (l + u) / 2;
            boolean res = check(a, N, c);
            Collections.reverse(a);
            res = res || check(a, N, c);

            if (res) {
                l = c;
            } else {
                u = c;
            }
        }
        System.out.println(l);
    }
}